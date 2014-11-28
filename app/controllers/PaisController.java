package controllers;

import com.avaje.ebean.Ebean;
import models.locale.Pais;
import play.Logger;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class PaisController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Pais");

        Pais pais = Json.fromJson(request().body().asJson(), Pais.class);

        Ebean.save(pais);

        return created(Json.toJson(pais));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Pais");

        Pais pais = Json.fromJson(request().body().asJson(), Pais.class);

        Ebean.update(pais);

        return ok(Json.toJson(pais));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId País");

        Pais pais = Ebean.find(Pais.class, id);

        if (pais == null) {
            return notFound(Json.toJson("pais nao encontrado"));
        }

        return ok(Json.toJson(pais));
    }

    public static Result buscaTodos() {
        Logger.info("busca Todos os Paises");
        return ok(Json.toJson(Ebean.find(Pais.class).findList()));
    }

    public static Result remover(Integer id) {
        Logger.info("remover pais");

        Pais pais = Ebean.find(Pais.class, id);

        if (pais == null) {
            return notFound("País não encontrado");
        }

        try {
            Ebean.delete(pais);
        } catch (Exception e){
            return badRequest(e.getCause().getLocalizedMessage().toString());
        }

        return ok(Json.toJson(pais));
    }
}
