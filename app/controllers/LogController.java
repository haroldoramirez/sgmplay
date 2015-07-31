package controllers;

import actions.PlayAuthenticatedSecured;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.Query;
import models.Log;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import java.util.Date;
import java.util.List;

/**
 * Created by Haroldo Ramirez on 31/07/2015.
 */

public class LogController extends Controller {

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result inserir(String mensagem) {
        Log log = new Log();
        log.setMensagem(mensagem);
        log.setData(new Date());
        Ebean.save(log);
        return ok();
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result listarTodos() {
        return ok(Json.toJson(Ebean.find(Log.class).order().desc("data").findList()));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result filtraPorNome(String filtro) {

        Query<Log> query = Ebean.createQuery(Log.class, "find log where (data like :data or mensagem like :mensagem)");
        query.setParameter("data", "%" + filtro + "%");
        query.setParameter("mensagem", "%" + filtro + "%");
        List<Log> filtroDeLogs = query.findList();

        return ok(Json.toJson(filtroDeLogs));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result buscaPorId(Long id) {

        Log log = Ebean.find(Log.class, id);

        if (log == null) {
            return notFound("Log não encontrado");
        }

        return ok(Json.toJson(log));
    }
}
