package controllers;

import com.avaje.ebean.Ebean;
import models.Estado;
import models.Pais;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class EstadoController extends Controller {


    public static Result inserir() {
        Logger.info("Salvando Estado");

        Estado estado = Json.fromJson(request().body().asJson(), Estado.class);

        Pais pais = Ebean.find(Pais.class, estado.getPais().getId());

        estado.setPais(pais);

        Ebean.save(estado);

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
            return notFound(Json.toJson("Estado não encontrado"));
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

        Ebean.delete(estado);

        return ok(Json.toJson(estado));
    }
}
