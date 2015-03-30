package controllers;

import java.util.Calendar;
import java.util.List;

import javax.persistence.PersistenceException;

import models.stock.Categoria;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.PagingList;

public class CategoriaController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Categoria");

        Categoria categoria = Json.fromJson(request().body().asJson(), Categoria.class);

        categoria.setDataDeCadastro(Calendar.getInstance());

        try {
           Ebean.save(categoria);
        } catch (PersistenceException e) {
            return badRequest("Categoria já Cadastrada");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        categoria.setDataDeCadastro(Calendar.getInstance());
        return ok(Json.toJson(categoria));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Categoria");

        Categoria categoria = Json.fromJson(request().body().asJson(), Categoria.class);

        categoria.setDataDeAlteracao(Calendar.getInstance());
        Ebean.update(categoria);

        return ok(Json.toJson(categoria));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId Categoria");

        Categoria categoria = Ebean.find(Categoria.class, id);

        if (categoria == null) {
            return notFound("Categoria Não Encontrada");
        }

        return ok(Json.toJson(categoria));
    }

    //Mostrar acima de 14 linhas
    public static Result buscaPorPaginas(Integer pagina) {
        Logger.info("busca por página");

        PagingList<Categoria> pagingList =
                Ebean.find(Categoria.class)
                        .order()
                        .asc("descricao")
                        .where().gt("descricao", "2")
                        .findPagingList(14).setFetchAhead(true);

        pagingList.getFutureRowCount();

        Page<Categoria> page = pagingList.getPage(pagina);

        List<Categoria> list = page.getList();

        return ok(Json.toJson(list));
    }
    
    public static Result buscaTodos() {
        Logger.info("busca Todas Categorias");
        return ok(Json.toJson(Ebean.find(Categoria.class)
                .order()
                .asc("descricao")
                .where()
                .gt("descricao", "2")
                .setMaxRows(14)
                .findList()));
    }

    public static Result remover(Integer id) {
        Logger.info("remover categoria");

        Categoria categoria = Ebean.find(Categoria.class, id);

        if (categoria == null) {
            return notFound("Categoria Não Encontrada");
        }

        try {
            Ebean.delete(categoria);
        } catch (PersistenceException e) {
            return badRequest("Existem produtos que pertencem a esta categoria, remova-os primeiro.");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }
        return ok(Json.toJson(categoria));
    }
}
