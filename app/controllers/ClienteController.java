package controllers;

import com.avaje.ebean.Ebean;
import models.Cliente;
import models.locale.Bairro;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

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
        Logger.info("busca Todos os Clientes");
        return ok(Json.toJson(Ebean.find(Cliente.class).findList()));
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
