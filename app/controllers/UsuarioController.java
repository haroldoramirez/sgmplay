package controllers;

import actions.PlayAuthenticatedSecured;
import akka.util.Crypt;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.Query;
import models.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.persistence.PersistenceException;
import java.util.Calendar;
import java.util.Formatter;
import java.util.List;

public class UsuarioController extends Controller {

    static Logger logger = LoggerFactory.getLogger(UsuarioController.class);

    static LogController logController = new LogController();

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result inserir() {

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);

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

        usuario.setDataCadastro(Calendar.getInstance());
        usuario.setDataAlteracao(Calendar.getInstance());

        try {
            Ebean.save(usuario);
            logger.info("Criado um novo usuário: {}", usuario.getEmail());
            formatter.format("Conta: '%1s' cadastrou um novo usuário: '%2s'", username, usuario.getEmail());
            logController.inserir(sb.toString());
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(usuario));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result atualizar(Long id) {

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);

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

        usuario.setDataAlteracao(Calendar.getInstance());

        try {
            Ebean.update(usuario);
            logger.info("Usuário: '{}' atualizado", usuario.getEmail());
            formatter.format("Conta: '%1s' atualizou o usuário: '%2s'", username, usuario.getEmail());
            logController.inserir(sb.toString());
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(usuario));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result buscaPorId(Long id) {

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
    public static Result remover(Long id) {

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);

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
            logger.info("Usuário deletado");
            formatter.format("Conta: '%1s' deletou um usuário", username);
            logController.inserir(sb.toString());
        }  catch (PersistenceException e) {
            return badRequest("Existem transações no sistema que depende deste usuário");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(usuario));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result filtraPorNome(String filtro) {

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
