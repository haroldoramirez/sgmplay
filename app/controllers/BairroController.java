package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.PagingList;
import models.locale.Bairro;
import models.locale.Cidade;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;
import java.util.Calendar;
import java.util.List;

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
        Logger.info("busca Todos Bairros ordenados");
        return ok(Json.toJson(Ebean.find(Bairro.class)
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

        PagingList<Bairro> pagingList =
                Ebean.find(Bairro.class)
                        .order()
                        .asc("nome")
                        .where().gt("nome", "2")
                        .findPagingList(14).setFetchAhead(true);

        pagingList.getFutureRowCount();

        Page<Bairro> page = pagingList.getPage(pagina);

        List<Bairro> list = page.getList();

        return ok(Json.toJson(list));
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
