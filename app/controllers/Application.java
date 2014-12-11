package controllers;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

    public static Result versaoplay() {
        return ok(Json.toJson(play.core.PlayVersion.current()));
    }

}