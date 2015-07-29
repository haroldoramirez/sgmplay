package controllers;

import actions.PlayAuthenticatedSecured;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.Query;
import models.stock.Categoria;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.persistence.PersistenceException;
import java.util.List;

public class CategoriaController extends Controller {

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result inserir() {
        Logger.info("Salvando Categoria");

        Categoria categoria = Json.fromJson(request().body().asJson(), Categoria.class);

        Categoria categoriaBusca = Ebean.find(Categoria.class).where().eq("nome", categoria.getNome()).findUnique();

        if (categoriaBusca != null) {
            return badRequest("Categoria já esta cadastrada");
        }

        try {
            Ebean.save(categoria);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(categoria));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result atualizar(Long id) {
        Logger.info("Atualizando Categoria");

        Categoria categoria = Json.fromJson(request().body().asJson(), Categoria.class);

        Categoria categoriaBusca = Ebean.find(Categoria.class, id);

        if (categoriaBusca == null) {
            return notFound(" Categoria não encontrada");
        }

        try {
            Ebean.update(categoria);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(categoria));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result buscaPorId(Long id) {
        Logger.info("Buscando Categoria por ID");

        Categoria categoriaBusca = Ebean.find(Categoria.class, id);

        if (categoriaBusca == null) {
            return notFound(" Categoria não encontrada");
        }

        return ok(Json.toJson(categoriaBusca));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result buscaTodos() {
        Logger.info("Busca todas os Categorias");

        return ok(Json.toJson(Ebean.find(Categoria.class)
                .order()
                .asc("nome")
                .findList()));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result remover(Long id) {
        Logger.info("Remover Categoria");

        Categoria categoriaBusca = Ebean.find(Categoria.class, id);

        if (categoriaBusca == null) {
            return notFound(" Categoria não encontrada");
        }

        try {
            Ebean.delete(categoriaBusca);
        } catch (PersistenceException e) {
            return badRequest("Existem Produtos que dependem deste Fabricante, remova-os primeiro");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(categoriaBusca));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result filtraPorNome(String filtro) {
        Logger.info("Filtrando Categoria por nome");

        Query<Categoria> query = Ebean.createQuery(Categoria.class, "find categoria where (nome like :nome)");
        query.setParameter("nome", "%" + filtro + "%");
        List<Categoria> filtroDeCategorias = query.findList();

        return ok(Json.toJson(filtroDeCategorias));
    }

}
