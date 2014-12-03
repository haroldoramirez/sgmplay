package controllers;

import com.avaje.ebean.Ebean;
import models.locale.Estado;
import models.locale.Pais;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;

public class EstadoController extends Controller {


    public static Result inserir() {
        Logger.info("Salvando Estado");

        Estado estado = Json.fromJson(request().body().asJson(), Estado.class);

        Pais pais = Ebean.find(Pais.class, estado.getPais().getId());

        estado.setPais(pais);

        try{
            Ebean.save(estado);
        } catch (PersistenceException e) {
            return badRequest("Estado já Cadastrado");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(estado));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Estado");

        Estado estado = Json.fromJson(request().body().asJson(), Estado.class);

        Pais pais = Ebean.find(Pais.class, estado.getPais().getId());

        estado.setPais(pais);

        Ebean.update(estado);

        return ok(Json.toJson(estado));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId Estado");

        Estado estado = Ebean.find(Estado.class, id);

        if (estado == null) {
            return notFound("Estado não encontrado");
        }

        return ok(Json.toJson(estado));
    }

    public static Result buscaTodos() {
        Logger.info("busca Todos os Estados");
        return ok(Json.toJson(Ebean.find(Estado.class).findList()));
    }

    public static Result remover(Integer id) {
        Logger.info("remover estado");

        Estado estado = Ebean.find(Estado.class, id);

        if (estado == null) {
            return notFound("Estado não encontrado");
        }

        try {
            Ebean.delete(estado);
        } catch (PersistenceException e) {
            return badRequest("Existem cidades que pertencem a este estado, remova-os primeiro.");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(estado));
    }
}
