package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

    public static Result versaoplay() {
        return ok(views.html.versaoplay.render("Versão do Play ", play.core.PlayVersion.current()));
    }

}