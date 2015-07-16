package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.PagingList;
import com.avaje.ebean.Query;
import models.Cliente;
import models.Situacao;
import models.locale.Bairro;
import models.locale.Cidade;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import validators.ValidaCPF;

import javax.persistence.PersistenceException;
import java.util.Calendar;
import java.util.List;

public class ClienteController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Cliente");

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
        cliente.setDataDeCadastro(Calendar.getInstance());

        try {
            Ebean.save(cliente);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(cliente));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Cliente");

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

        cliente.setDataDeAlteracao(Calendar.getInstance());

        try {
            Ebean.update(cliente);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(cliente));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("Buscando Bairro por ID");

        Cliente cliente = Ebean.find(Cliente.class, id);

        if (cliente == null) {
            return notFound("Cliente não Encontrado");
        }

        return ok(Json.toJson(cliente));
    }

    public static Result buscaTodos() {
        Logger.info("Busca todos os Clientes");

        return ok(Json.toJson(Ebean.find(Cliente.class)
                .order()
                .asc("nome")
                .findList()));
    }


    public static Result remover(Integer id) {
        Logger.info("Remover Cliente");

        Cliente cliente = Ebean.find(Cliente.class, id);

        if (cliente == null) {
            return notFound("Cliente não encontrado");
        }

        try {
            Ebean.delete(cliente);
        } catch (PersistenceException e) {
            return badRequest("Existem Vendas que dependem deste Cliente");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(cliente));
    }

    public static Result filtraPorNome(String filtro) {
        Logger.info("Filtrando Cliente");

        Query<Cliente> query = Ebean.createQuery(Cliente.class, "find cliente where (nome like :nome or cpf like :cpf)");
        query.setParameter("nome", "%" + filtro + "%");
        query.setParameter("cpf", "%" + filtro + "%");
        List<Cliente> filtroDeClientes = query.findList();
        return ok(Json.toJson(filtroDeClientes));
    }

}
