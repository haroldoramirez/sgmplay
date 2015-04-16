package controllers;

import java.util.Calendar;
import java.util.List;

import javax.persistence.PersistenceException;

import akka.util.Crypt;
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

        Usuario usuarioBusca = Ebean.find(Usuario.class).where().eq("email", usuario.getEmail()).findUnique();

        if (usuarioBusca != null) {
            return badRequest("Usuário já Cadastrado");
        }

        String senha = Crypt.sha1(usuario.getSenha());

        usuario.setSenha(senha);

        usuario.setPadraoDoSistema(false);

        usuario.setDataDeCadastro(Calendar.getInstance());

        try {
            Ebean.save(usuario);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(usuario));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Usuário");

        Usuario usuario = Json.fromJson(request().body().asJson(), Usuario.class);

        String senha = Crypt.sha1(usuario.getSenha());

        usuario.setSenha(senha);

        usuario.setDataDeAlteracao(Calendar.getInstance());

        try {
            Ebean.update(usuario);
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
                .asc("email")
                .where()
                .gt("email", "2")
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
                        .asc("email")
                        .where().gt("email", "2")
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

        if (usuario.isPadraoDoSistema()) {
            return badRequest("Usuário padrão do sistema");
        }

        try {
            Ebean.delete(usuario);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(usuario));
    }
}
