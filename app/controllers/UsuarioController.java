package controllers;

import actions.PlayAuthenticatedSecured;
import akka.util.Crypt;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.Query;
import models.Usuario;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.persistence.PersistenceException;
import java.util.Calendar;
import java.util.List;

public class UsuarioController extends Controller {

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result inserir() {
        Logger.info("Salvando Usuário");

        String username = session().get("email");

        //busca o usuário atual que esteja logado no sistema
        Usuario usuarioAtual = Ebean.createQuery(Usuario.class, "find usuario where email = :email")
                .setParameter("email", username)
                .findUnique();

        //verificar se o usuario atual encontrado é administrador
        if (usuarioAtual.getPrivilegio() == 1) {
            return badRequest("Você não tem privilégios de Administrador");
        }

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

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Usuário");

        String username = session().get("email");

        //busca o usuário atual que esteja logado no sistema
        Usuario usuarioAtual = Ebean.createQuery(Usuario.class, "find usuario where email = :email")
                .setParameter("email", username)
                .findUnique();

        //verificar se o usuario atual encontrado é administrador
        if (usuarioAtual.getPrivilegio() == 1) {
            return badRequest("Você não tem privilégios de Administrador");
        }

        Usuario usuario = Json.fromJson(request().body().asJson(), Usuario.class);

        if (usuario.getPadraoDoSistema() == true) {
            return badRequest("Usuário padrão do sistema");
        }

        Usuario usuarioBusca = Ebean.find(Usuario.class, id);

        if (usuarioBusca == null) {
            return badRequest("Usuário não encontrado");
        }

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

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result buscaPorId(Integer id) {
        Logger.info("Buscando Usuário por ID");

        String username = session().get("email");

        //busca o usuário atual que esteja logado no sistema
        Usuario usuarioAtual = Ebean.createQuery(Usuario.class, "find usuario where email = :email")
                .setParameter("email", username)
                .findUnique();

        //verificar se o usuario atual encontrado é administrador
        if (usuarioAtual.getPrivilegio() == 1) {
            return badRequest("Você não tem privilégios de Administrador");
        }

        Usuario usuario = Ebean.find(Usuario.class, id);

        if (usuario == null) {
            return notFound("Usuário não encontrado");
        }

        return ok(Json.toJson(usuario));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result buscaTodos() {
        Logger.info("busca Todos os Usuários");

        String username = session().get("email");

        //busca o usuário atual que esteja logado no sistema
        Usuario usuarioAtual = Ebean.createQuery(Usuario.class, "find usuario where email = :email")
                .setParameter("email", username)
                .findUnique();

        //verificar se o usuario atual encontrado é administrador
        if (usuarioAtual.getPrivilegio() == 1) {
            return badRequest("Você não tem privilégios de Administrador");
        }

        return ok(Json.toJson(Ebean.find(Usuario.class)
                .order()
                .asc("email")
                .findList()));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result remover(Integer id) {
        Logger.info("remover usuário");

        String username = session().get("email");

        //busca o usuário atual que esteja logado no sistema
        Usuario usuarioAtual = Ebean.createQuery(Usuario.class, "find usuario where email = :email")
                .setParameter("email", username)
                .findUnique();

        //verificar se o usuario atual encontrado é administrador
        if (usuarioAtual.getPrivilegio() == 1) {
            return badRequest("Você não tem privilégios de Administrador");
        }

        Usuario usuario = Ebean.find(Usuario.class, id);

        if (usuario == null) {
            return notFound("Usuário não encontrado");
        }

        if (usuario.getPadraoDoSistema() == true) {
            return badRequest("Usuário padrão do sistema");
        }

        if (usuarioAtual.getEmail().equals(usuario.getEmail())) {
            return badRequest("Não remover seu próprio usuário enquanto ele estiver autenticado");
        }

        try {
            Ebean.delete(usuario);
        }  catch (PersistenceException e) {
            return badRequest("Existem transações no sistema que depende deste usuário");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(usuario));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result filtraPorNome(String filtro) {
        Logger.info("Filtrando Usuário por email");

        String username = session().get("email");

        //busca o usuário atual que esteja logado no sistema
        Usuario usuarioAtual = Ebean.createQuery(Usuario.class, "find usuario where email = :email")
                .setParameter("email", username)
                .findUnique();

        //verificar se o usuario atual encontrado é administrador
        if (usuarioAtual.getPrivilegio() == 1) {
            return badRequest("Você não tem privilégios de Administrador");
        }

        Query<Usuario> query = Ebean.createQuery(Usuario.class, "find usuario where (email like :email)");
        query.setParameter("email", "%" + filtro + "%");
        List<Usuario> filtroDeUsuarios = query.findList();

        return ok(Json.toJson(filtroDeUsuarios));
    }
}
