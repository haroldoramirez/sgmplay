package controllers;

import com.avaje.ebean.Ebean;
import models.Usuario;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

    public static Result index() {
        String username = session().get("email");

        Integer privilegio = 0;

        if (username == null) {
            return ok(views.html.index.render(username, privilegio));
        }

        //busca o usuário atual que esteja logado no sistema
        Usuario usuarioAtual = Ebean.createQuery(Usuario.class, "find usuario where email = :email")
                .setParameter("email", username)
                .findUnique();

        privilegio = usuarioAtual.getPrivilegio();

        return ok(views.html.index.render(username, privilegio));

    }

}