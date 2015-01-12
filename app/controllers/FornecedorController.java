package controllers;

import com.avaje.ebean.Ebean;
import models.Fornecedor;
import models.locale.Bairro;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;

public class FornecedorController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Fornecedor");

        Fornecedor fornecedor = Json.fromJson(request().body().asJson(), Fornecedor.class);

        Bairro bairro = Ebean.find(Bairro.class, fornecedor.getBairro().getId());

        fornecedor.setBairro(bairro);

        try {
            Ebean.save(fornecedor);
        } catch (PersistenceException e) {
            return badRequest("Fornecedor já Cadastrado");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(fornecedor));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Fornecedor");

        Fornecedor fornecedor = Json.fromJson(request().body().asJson(), Fornecedor.class);

        Bairro bairro = Ebean.find(Bairro.class, fornecedor.getBairro().getId());

        fornecedor.setBairro(bairro);

        Ebean.update(fornecedor);

        return ok(Json.toJson(fornecedor));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId Fornecedor");

        Fornecedor fornecedor = Ebean.find(Fornecedor.class, id);

        if (fornecedor == null) {
            return notFound("Fornecedor não Encontrado");
        }

        return ok(Json.toJson(fornecedor));
    }

    public static Result buscaTodos() {
        Logger.info("busca Todos os Fornecedores");
        return ok(Json.toJson(Ebean.find(Fornecedor.class).findList()));
    }

    public static Result remover(Integer id) {
        Logger.info("remover Fornecedor");

        Fornecedor fornecedor = Ebean.find(Fornecedor.class, id);

        if (fornecedor == null) {
            return notFound("Fornecedor não encontrado");
        }

        try {
            Ebean.delete(fornecedor);
        } catch (PersistenceException e) {
            return badRequest("Existem Produtos que dependem deste Fornecedor");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(fornecedor));
    }


}
