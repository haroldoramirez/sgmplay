package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.PagingList;
import models.Cliente;
import models.Situacao;
import models.locale.Bairro;
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

        ValidaCPF validaCPF = new ValidaCPF();

        Cliente cliente = Json.fromJson(request().body().asJson(), Cliente.class);

        Bairro bairro = Ebean.find(Bairro.class, cliente.getBairro().getId());

        cliente.setBairro(bairro);

        if (!validaCPF.isCPF(cliente.getCpf())) {
            return badRequest("CPF Inválido");
        }

        cliente.setSituacao(Situacao.INATIVO);
        cliente.setDataDeCadastro(Calendar.getInstance());

        try {
            Ebean.save(cliente);
        } catch (PersistenceException e) {
            return badRequest("Cliente já Cadastrado");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(cliente));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Cliente");

        ValidaCPF validaCPF = new ValidaCPF();

        Cliente cliente = Json.fromJson(request().body().asJson(), Cliente.class);

        Bairro bairro = Ebean.find(Bairro.class, cliente.getBairro().getId());

        cliente.setBairro(bairro);

        if (!validaCPF.isCPF(cliente.getCpf())) {
            return badRequest("CPF Inválido");
        }

        cliente.setDataDeAlteracao(Calendar.getInstance());
        try {
            Ebean.update(cliente);
        } catch (PersistenceException e) {
            return badRequest("Cliente já Cadastrado");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(cliente));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId Cliente");

        Cliente cliente = Ebean.find(Cliente.class, id);

        if (cliente == null) {
            return notFound("Cliente não Encontrado");
        }

        return ok(Json.toJson(cliente));
    }

    public static Result buscaTodos() {
        Logger.info("busca Todos os Clientes ordenados");
        return ok(Json.toJson(Ebean.find(Cliente.class)
                .order()
                .asc("nome")
                .where()
                .gt("nome", "2")
                .setMaxRows(14)
                .findList()));
    }

    //Mostrar acima de 14 linhas
    public static Result buscaPorPaginas(Integer pagina) {
        Logger.info("busca por página");

        PagingList<Cliente> pagingList =
                Ebean.find(Cliente.class)
                        .order()
                        .asc("nome")
                        .where().gt("nome", "2")
                        .findPagingList(14).setFetchAhead(true);

        pagingList.getFutureRowCount();

        Page<Cliente> page = pagingList.getPage(pagina);

        List<Cliente> list = page.getList();

        return ok(Json.toJson(list));
    }

    public static Result remover(Integer id) {
        Logger.info("remover Cliente");

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

}
