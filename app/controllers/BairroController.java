package controllers;

import com.avaje.ebean.Ebean;
import models.locale.Bairro;
import models.locale.Cidade;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;

public class BairroController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Bairro");

        Bairro bairro = Json.fromJson(request().body().asJson(), Bairro.class);

        Cidade cidade = Ebean.find(Cidade.class, bairro.getCidade().getId());

        bairro.setCidade(cidade);

        try {
            Ebean.save(bairro);
        } catch (PersistenceException e) {
            return badRequest("Bairro já Cadastrado");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(bairro));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Bairro");

        Bairro bairro = Json.fromJson(request().body().asJson(), Bairro.class);

        Cidade cidade = Ebean.find(Cidade.class, bairro.getCidade().getId());

        bairro.setCidade(cidade);

        Ebean.update(bairro);

        return ok(Json.toJson(bairro));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId Bairro");

        Bairro bairro = Ebean.find(Bairro.class, id);

        if (bairro == null) {
            return notFound("Bairro não Encontrada");
        }

        return ok(Json.toJson(bairro));
    }

    public static Result buscaTodos() {
        Logger.info("busca Todos os Bairros");
        return ok(Json.toJson(Ebean.find(Bairro.class).findList()));
    }

    public static Result remover(Integer id) {
        Logger.info("remover Bairro");

        Bairro bairro = Ebean.find(Bairro.class, id);

        if (bairro == null) {
            return notFound("Bairro não encontrado");
        }

        try {
            Ebean.delete(bairro);
        } catch (PersistenceException e) {
            return badRequest("Existem clientes que residem neste bairro, remova-os primeiro.");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(bairro));
    }
}
