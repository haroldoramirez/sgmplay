package controllers;

import com.avaje.ebean.Ebean;
import models.stock.UnidadeDeMedida;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;

public class UnidadeDeMedidaController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Unidade de Medida");

        UnidadeDeMedida unidadeDeMedida = Json.fromJson(request().body().asJson(), UnidadeDeMedida.class);

        try{
            Ebean.save(unidadeDeMedida);
        }catch (PersistenceException e) {
            return badRequest("Unidade de Medida já Cadastrada");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(unidadeDeMedida));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Unidade de Medida");

        UnidadeDeMedida unidadeDeMedida = Json.fromJson(request().body().asJson(), UnidadeDeMedida.class);

        Ebean.update(unidadeDeMedida);

        return ok(Json.toJson(unidadeDeMedida));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId Unidade de Medida");

        UnidadeDeMedida unidadeDeMedida = Ebean.find(UnidadeDeMedida.class, id);

        if (unidadeDeMedida == null) {
            return notFound("Unidade de Medida não encontrada");
        }

        return ok(Json.toJson(unidadeDeMedida));
    }

    public static Result buscaTodos() {
        Logger.info("busca Todas as Unidades de Medida");
        return ok(Json.toJson(Ebean.find(UnidadeDeMedida.class).findList()));
    }

    public static Result remover(Integer id) {
        Logger.info("remover Unidade de Medida");

        UnidadeDeMedida unidadeDeMedida = Ebean.find(UnidadeDeMedida.class, id);

        if (unidadeDeMedida == null) {
            return notFound("Unidade de Medida não encontrada");
        }

        try {
            Ebean.delete(unidadeDeMedida);
        } catch (PersistenceException e) {
            return badRequest("Existem produtos que pertencem a esta Unidade de Medida, remova-os primeiro.");

        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(unidadeDeMedida));
    }
}
