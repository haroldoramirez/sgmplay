package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.PagingList;
import models.Cliente;
import models.locale.Bairro;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

public class ClienteController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Cliente");

        Cliente cliente = Json.fromJson(request().body().asJson(), Cliente.class);

        Bairro bairro = Ebean.find(Bairro.class, cliente.getBairro().getId());

        cliente.setBairro(bairro);

        Ebean.save(cliente);

        return created(Json.toJson(cliente));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Cliente");

        Cliente cliente = Json.fromJson(request().body().asJson(), Cliente.class);

        Bairro bairro = Ebean.find(Bairro.class, cliente.getBairro().getId());

        cliente.setBairro(bairro);

        Ebean.update(cliente);

        return ok(Json.toJson(cliente));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId Cliente");

        Cliente cliente = Ebean.find(Cliente.class, id);

        if (cliente == null) {
            return notFound("Cliente não Encontrada");
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

        Ebean.delete(cliente);

        return ok(Json.toJson(cliente));
    }

}
