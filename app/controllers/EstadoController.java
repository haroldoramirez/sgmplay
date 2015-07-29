package controllers;

import actions.PlayAuthenticatedSecured;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.Query;
import models.locale.Estado;
import models.locale.Pais;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.persistence.PersistenceException;
import java.util.List;

public class EstadoController extends Controller {

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result inserir() {
        Logger.info("Salvando Estado");

        Estado estado = Json.fromJson(request().body().asJson(), Estado.class);

        Estado estadoBusca = Ebean.find(Estado.class).where().eq("nome", estado.getNome()).findUnique();

        if (estadoBusca != null) {
            return badRequest("Estado já cadastrado");
        }

        Pais pais = Ebean.find(Pais.class, estado.getPais().getId());

        estado.setPais(pais);

        try {
            Ebean.save(estado);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(estado));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result atualizar(Long id) {
        Logger.info("Atualizando Estado");

        Estado estado = Json.fromJson(request().body().asJson(), Estado.class);

        Estado estadoBusca = Ebean.find(Estado.class, id);

        if (estadoBusca == null) {
            return notFound("Estado não encontrado");
        }

        Pais pais = Ebean.find(Pais.class, estado.getPais().getId());

        estado.setPais(pais);

        try {
            Ebean.update(estado);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(estado));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result buscaPorId(Long id) {
        Logger.info("Buscando Estado por ID");

        Estado estado = Ebean.find(Estado.class, id);

        if (estado == null) {
            return notFound("Estado não encontrado");
        }

        return ok(Json.toJson(estado));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result buscaTodos() {
        Logger.info("Busca todos os Estados");

        return ok(Json.toJson(Ebean.find(Estado.class)
                .order()
                .asc("nome")
                .findList()));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result remover(Long id) {
        Logger.info("Remover Estado");

        Estado estado = Ebean.find(Estado.class, id);

        if (estado == null) {
            return notFound("Estado não encontrado");
        }

        try {
            Ebean.delete(estado);
        } catch (PersistenceException e) {
            return badRequest("Existem Cidades que dependem deste Estado, remova-os primeiro");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(estado));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result filtraPorNome(String filtro) {
        Logger.info("Filtrando Estado por nome");
        Query<Estado> query = Ebean.createQuery(Estado.class, "find estado where (nome like :nome or pais.nome like :paisNome)");
        query.setParameter("nome", "%" + filtro + "%");
        query.setParameter("paisNome", "%" + filtro + "%");
        List<Estado> filtroDeEstados = query.findList();
        return ok(Json.toJson(filtroDeEstados));
    }
}
