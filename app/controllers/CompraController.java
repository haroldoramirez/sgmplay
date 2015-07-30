package controllers;

import actions.PlayAuthenticatedSecured;
import com.avaje.ebean.Ebean;
import models.purchase.Compra;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

/**
 * Created by haroldo on 29/07/15.
 */

public class CompraController extends Controller {

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result inserir() {
        return TODO;
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result atualizar(Long id) {
        return TODO;
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result buscaPorId(Long id) {
        return TODO;
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result buscaTodos() {
        Logger.info("Busca todas as compras");

        return ok(Json.toJson(Ebean.find(Compra.class)
                .order()
                .asc("dataCompra")
                .findList()));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result remover(Long id) {
        return TODO;
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result filtraPorNome(String filtro) {
        return TODO;
    }
}
