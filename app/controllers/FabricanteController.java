package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.PagingList;
import models.stock.Fabricante;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;
import java.util.List;

public class FabricanteController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Fabricante");

        Fabricante fabricante = Json.fromJson(request().body().asJson(), Fabricante.class);

        try {
            Ebean.save(fabricante);
        } catch (PersistenceException e) {
            return badRequest("Fabricante já Cadastrado");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }
        return created(Json.toJson(fabricante));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Fabricante");

        Fabricante fabricante = Json.fromJson(request().body().asJson(), Fabricante.class);

        Ebean.update(fabricante);

        return ok(Json.toJson(fabricante));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId Fabricante");

        Fabricante fabricante = Ebean.find(Fabricante.class, id);

        if (fabricante == null) {
            return notFound("Fabricante não encontrado");
        }

        return ok(Json.toJson(fabricante));
    }

    public static Result buscaTodos() {
        Logger.info("busca Todos os Fabricantes ordenados");
        return ok(Json.toJson(Ebean.find(Fabricante.class)
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

        PagingList<Fabricante> pagingList =
                Ebean.find(Fabricante.class)
                        .order()
                        .asc("nome")
                        .where().gt("nome", "2")
                        .findPagingList(14).setFetchAhead(true);

        pagingList.getFutureRowCount();

        Page<Fabricante> page = pagingList.getPage(pagina);

        List<Fabricante> list = page.getList();

        return ok(Json.toJson(list));
    }

    public static Result remover(Integer id) {
        Logger.info("remover pais");

        Fabricante fabricante = Ebean.find(Fabricante.class, id);

        if (fabricante == null) {
            return notFound("Fabricante não encontrado");
        }

        try {
            Ebean.delete(fabricante);
        } catch (PersistenceException e) {
            return badRequest("Existem produtos que pertencem a este fabricante, remova-os primeiro.");

        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(fabricante));
    }

}
