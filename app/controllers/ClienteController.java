package controllers;

import actions.PlayAuthenticatedSecured;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.Query;
import models.Cliente;
import models.Situacao;
import models.locale.Bairro;
import org.slf4j.LoggerFactory;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import validators.ValidaCPF;

import javax.persistence.PersistenceException;
import java.util.Calendar;
import java.util.Formatter;
import java.util.List;

public class ClienteController extends Controller {

    static org.slf4j.Logger logger = LoggerFactory.getLogger(ClienteController.class);

    static LogController logController = new LogController();

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result inserir() {

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);

        String username = session().get("email");

        Cliente cliente = Json.fromJson(request().body().asJson(), Cliente.class);

        Cliente clienteBuscaCpf = Ebean.find(Cliente.class).where().eq("cpf", cliente.getCpf()).findUnique();

        if (clienteBuscaCpf != null) {
            return badRequest("O Cliente já esta cadastrado");
        }

        Bairro bairro = Ebean.find(Bairro.class, cliente.getBairro().getId());

        cliente.setBairro(bairro);

        ValidaCPF validaCPF = new ValidaCPF();

        if (!validaCPF.isCPF(cliente.getCpf())) {
            return badRequest("O CPF é Inválido");
        }

        cliente.setSituacao(Situacao.INATIVO);
        cliente.setDataCadastro(Calendar.getInstance());
        cliente.setDataAlteracao(Calendar.getInstance());

        try {
            Ebean.save(cliente);
            logger.info("Cadastrado novo cliente: {}", cliente.getNome());
            formatter.format("Conta: '%1s' cadastrou um novo cliente: '%2s'", username, cliente.getNome());
            logController.inserir(sb.toString());
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(cliente));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result atualizar(Long id) {

        String username = session().get("email");

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);

        Cliente cliente = Json.fromJson(request().body().asJson(), Cliente.class);

        Cliente clienteBusca = Ebean.find(Cliente.class, id);

        if (clienteBusca == null) {
            return notFound("O Cliente não foi encontrado");
        }

        ValidaCPF validaCPF = new ValidaCPF();

        if (!validaCPF.isCPF(cliente.getCpf())) {
            return badRequest("O CPF é Inválido");
        }

        Bairro bairro = Ebean.find(Bairro.class, cliente.getBairro().getId());

        cliente.setBairro(bairro);

        cliente.setDataAlteracao(Calendar.getInstance());

        try {
            Ebean.update(cliente);
            logger.info("Cliente: '{}' atualizado", cliente.getNome());
            formatter.format("Conta: '%1s' atualizou o cliente: '%2s'", username, cliente.getNome());
            logController.inserir(sb.toString());
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(cliente));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result buscaPorId(Long id) {
        Logger.info("Buscando Cliente por ID");

        Cliente cliente = Ebean.find(Cliente.class, id);

        if (cliente == null) {
            return notFound("Cliente não Encontrado");
        }

        return ok(Json.toJson(cliente));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result buscaTodos() {
        Logger.info("Busca todos os Clientes");

        return ok(Json.toJson(Ebean.find(Cliente.class)
                .order()
                .asc("nome")
                .findList()));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result remover(Long id) {

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);

        String username = session().get("email");

        Cliente cliente = Ebean.find(Cliente.class, id);

        if (cliente == null) {
            return notFound("Cliente não encontrado");
        }

        try {
            Ebean.delete(cliente);
            logger.info("Cliente deletado");
            formatter.format("Conta: '%1s' deletou um cliente", username);
            logController.inserir(sb.toString());
        } catch (PersistenceException e) {
            return badRequest("Existem Vendas que dependem deste Cliente");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(cliente));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result filtraPorNome(String filtro) {
        Logger.info("Filtrando Cliente");

        Query<Cliente> query = Ebean.createQuery(Cliente.class, "find cliente where (nome like :nome or cpf like :cpf)");
        query.setParameter("nome", "%" + filtro + "%");
        query.setParameter("cpf", "%" + filtro + "%");
        List<Cliente> filtroDeClientes = query.findList();
        return ok(Json.toJson(filtroDeClientes));
    }

}
