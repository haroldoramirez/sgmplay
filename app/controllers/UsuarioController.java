package controllers;

import com.avaje.ebean.Ebean;
import models.Usuario;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;

public class UsuarioController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Usuário");

        Usuario usuario = Json.fromJson(request().body().asJson(), Usuario.class);

        try{
            Ebean.save(usuario);
        }catch (PersistenceException e) {
            return badRequest("Usuário já Cadastrado");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(usuario));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Usuário");

        Usuario usuario = Json.fromJson(request().body().asJson(), Usuario.class);

        Ebean.update(usuario);

        return ok(Json.toJson(usuario));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId Usuário");

        Usuario usuario = Ebean.find(Usuario.class, id);

        if (usuario == null) {
            return notFound("Usuário não encontrado");
        }

        return ok(Json.toJson(usuario));
    }

    public static Result buscaTodos() {
        Logger.info("busca Todos os Usuários ordenados");
        return ok(Json.toJson(Ebean.find(Usuario.class).order().asc("login").findList()));
    }

    //Mostrar acima de 16 linhas
    public static Result busca() {
        Logger.info("busca os usuários");
        return ok(Json.toJson(Ebean.find(Usuario.class).setMaxRows(16).findList()));
    }

    public static Result remover(Integer id) {
        Logger.info("remover usuário");

        Usuario usuario = Ebean.find(Usuario.class, id);

        if (usuario == null) {
            return notFound("Usuário não encontrado");
        }

        try {
            Ebean.delete(usuario);
        } catch (PersistenceException e) {
            return badRequest("Existem funções que dependem deste usuário");

        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(usuario));
    }
}
