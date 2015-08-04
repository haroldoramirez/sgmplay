package controllers;

import actions.PlayAuthenticatedSecured;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.Query;
import models.Contato;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import java.util.List;

public class ContatoController extends Controller {

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result inserir() {
        Logger.info("Salvando Contato");

        Contato contato = Json.fromJson(request().body().asJson(), Contato.class);

        Contato busca = Ebean.find(Contato.class).where().eq("nome", contato.getNome()).findUnique();

        if (busca != null) {
            return badRequest("Contato já esta cadastrado");
        }

        try {
            Ebean.save(contato);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(contato));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result atualizar(Long id) {
        Logger.info("Atualizando Contato");

        Contato contato = Json.fromJson(request().body().asJson(), Contato.class);

        Contato busca = Ebean.find(Contato.class, id);

        if (busca == null) {
            return notFound("Contato não encontrado");
        }

        try {
            Ebean.update(contato);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(contato));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result buscaPorId(Long id) {
        Logger.info("Buscando Contato por ID");

        Contato contato = Ebean.find(Contato.class, id);

        if (contato == null) {
            return notFound("Contato não encontrado");
        }

        return ok(Json.toJson(contato));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result buscaTodos() {
        Logger.info("Busca todos os Contatos");

        return ok(Json.toJson(Ebean.find(Contato.class)
                .order()
                .asc("nome")
                .findList()));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result remover(Long id) {
        Logger.info("Remover Contato");

        Contato contato = Ebean.find(Contato.class, id);

        if (contato == null) {
            return notFound("Contato não encontrado");
        }

        try {
            Ebean.delete(contato);
        }  catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(contato));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result filtro(String filtro) {
        Logger.info("Filtrando Contato");
        
        Query<Contato> query = Ebean.createQuery(Contato.class, "find contato where (nome like :nome)");
        query.setParameter("nome", "%" + filtro + "%");
        List<Contato> filtroLista = query.findList();
        
        return ok(Json.toJson(filtroLista));
    }
}
