package controllers;

import com.avaje.ebean.Ebean;
import models.stock.Categoria;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;

public class CategoriaController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Categoria");

        Categoria categoria = Json.fromJson(request().body().asJson(), Categoria.class);

        try {
           Ebean.save(categoria);
        } catch (PersistenceException e) {
            return badRequest("Categoria já Cadastrada");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }
        return ok(Json.toJson(categoria));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Categoria");

        Categoria categoria = Json.fromJson(request().body().asJson(), Categoria.class);

        Ebean.update(categoria);

        return ok(Json.toJson(categoria));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId Categoria");

        Categoria categoria = Ebean.find(Categoria.class, id);

        if (categoria == null) {
            return notFound("Categoria Não Encontrada");
        }

        return ok(Json.toJson(categoria));
    }

    public static Result buscaTodos() {
        Logger.info("busca Todas as Categorias");
        return ok(Json.toJson(Ebean.find(Categoria.class).findList()));
    }

    public static Result remover(Integer id) {
        Logger.info("remover categoria");

        Categoria categoria = Ebean.find(Categoria.class, id);

        if (categoria == null) {
            return notFound("Categoria Não Encontrada");
        }

        try {
            Ebean.delete(categoria);
        } catch (PersistenceException e) {
            return badRequest("Existem produtos que pertencem a esta categoria, remova-os primeiro.");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }
        return ok(Json.toJson(categoria));
    }
}
