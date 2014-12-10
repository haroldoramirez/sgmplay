package controllers;

import com.avaje.ebean.Ebean;
import models.products.Fabricante;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;

public class FabricanteController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Fabricante");

        Fabricante fabricante = Json.fromJson(request().body().asJson(), Fabricante.class);

        try {
            Ebean.save(fabricante);
        } catch (PersistenceException e) {
            return badRequest("Fabricante já Cadastrado");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }
        return created(Json.toJson(fabricante));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Fabricante");

        Fabricante fabricante = Json.fromJson(request().body().asJson(), Fabricante.class);

        Ebean.update(fabricante);

        return ok(Json.toJson(fabricante));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId Fabricante");

        Fabricante fabricante = Ebean.find(Fabricante.class, id);

        if (fabricante == null) {
            return notFound("Fabricante não encontrado");
        }

        return ok(Json.toJson(fabricante));
    }

    public static Result buscaTodos() {
        Logger.info("busca Todos os Fabricantes");
        return ok(Json.toJson(Ebean.find(Fabricante.class).findList()));
    }

    public static Result remover(Integer id) {
        Logger.info("remover pais");

        Fabricante fabricante = Ebean.find(Fabricante.class, id);

        if (fabricante == null) {
            return notFound("Fabricante não encontrado");
        }

        try {
            Ebean.delete(fabricante);
        } catch (PersistenceException e) {
            return badRequest("Existem produtos que pertencem a este fabricante, remova-os primeiro.");

        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(fabricante));
    }

}
