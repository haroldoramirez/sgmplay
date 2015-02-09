package controllers;

import java.util.List;

import javax.persistence.PersistenceException;

import models.Usuario;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.PagingList;

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

        try {
            Ebean.update(usuario);
        } catch (PersistenceException e) {
            return badRequest("Usuário já Cadastrado");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

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
        return ok(Json.toJson(Ebean.find(Usuario.class)
                .order()
                .asc("login")
                .where()
                .gt("login", "2")
                .setMaxRows(14)
                .findList()));
    }

    //Mostrar acima de 16 linhas
    public static Result busca() {
        Logger.info("busca os usuários");
        return ok(Json.toJson(Ebean.find(Usuario.class).setMaxRows(16).findList()));
    }

    //Mostrar acima de 14 linhas
    public static Result buscaPorPaginas(Integer pagina) {
        Logger.info("busca por página");

        PagingList<Usuario> pagingList =
                Ebean.find(Usuario.class)
                        .order()
                        .asc("login")
                        .where().gt("login", "2")
                        .findPagingList(14).setFetchAhead(true);

        pagingList.getFutureRowCount();

        Page<Usuario> page = pagingList.getPage(pagina);

        List<Usuario> list = page.getList();

        return ok(Json.toJson(list));
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
