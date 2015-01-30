package controllers;

import java.util.List;

import javax.persistence.PersistenceException;

import models.locale.Pais;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.PagingList;

public class PaisController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Pais");

        Pais pais = Json.fromJson(request().body().asJson(), Pais.class);

        try{
            Ebean.save(pais);
        }catch (PersistenceException e) {
            return badRequest("País já Cadastrado");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(pais));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Pais");

        Pais pais = Json.fromJson(request().body().asJson(), Pais.class);

        Ebean.update(pais);

        return ok(Json.toJson(pais));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId Pais");

        Pais pais = Ebean.find(Pais.class, id);

        if (pais == null) {
            return notFound("País não encontrado");
        }

        return ok(Json.toJson(pais));
    }

    public static Result buscaTodos() {
        Logger.info("busca Todos os Paises ordenados");
        return ok(Json.toJson(Ebean.find(Pais.class)
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

        PagingList<Pais> pagingList =
                Ebean.find(Pais.class)
                        .order()
                        .asc("nome")
                        .where().gt("nome", "2")
                        .findPagingList(14).setFetchAhead(true);

        pagingList.getFutureRowCount();

        Page<Pais> page = pagingList.getPage(pagina);

        List<Pais> list = page.getList();

        return ok(Json.toJson(list));
    }

    public static Result remover(Integer id) {
        Logger.info("remover pais");

        Pais pais = Ebean.find(Pais.class, id);

        if (pais == null) {
            return notFound("País não encontrado");
        }

        try {
            Ebean.delete(pais);
        } catch (PersistenceException e) {
            return badRequest("Existem estados que pertencem a este país, remova-os primeiro.");

        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(pais));
    }
}
