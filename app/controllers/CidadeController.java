package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.PagingList;
import models.locale.Cidade;
import models.locale.Estado;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;
import java.util.List;

public class CidadeController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Cidade");

        Cidade cidade = Json.fromJson(request().body().asJson(), Cidade.class);

        Estado estado = Ebean.find(Estado.class, cidade.getEstado().getId());

        cidade.setEstado(estado);
        
        try {
            Ebean.save(cidade);
        } catch (PersistenceException e) {
            return badRequest("Cidade já Cadastrada");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(cidade));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Cidade");

        Cidade cidade = Json.fromJson(request().body().asJson(), Cidade.class);

        Estado estado = Ebean.find(Estado.class, cidade.getEstado().getId());

        cidade.setEstado(estado);

        Ebean.update(cidade);

        return ok(Json.toJson(cidade));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId Cidade");

        Cidade cidade = Ebean.find(Cidade.class, id);

        if (cidade == null) {
            return notFound("Cidade não Encontrada");
        }

        return ok(Json.toJson(cidade));
    }

    public static Result buscaTodos() {
        Logger.info("busca Todas as Cidades ordenadas");
        return ok(Json.toJson(Ebean.find(Cidade.class)
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

        PagingList<Cidade> pagingList =
                Ebean.find(Cidade.class)
                        .order()
                        .asc("nome")
                        .where().gt("nome", "2")
                        .findPagingList(14).setFetchAhead(true);

        pagingList.getFutureRowCount();

        Page<Cidade> page = pagingList.getPage(pagina);

        List<Cidade> list = page.getList();

        return ok(Json.toJson(list));
    }

    public static Result remover(Integer id) {
        Logger.info("remover cidade");

        Cidade cidade = Ebean.find(Cidade.class, id);

        if (cidade == null) {
            return notFound("Cidade não encontrada");
        }

        try {
            Ebean.delete(cidade);
        } catch (PersistenceException e) {
            return badRequest("Existem bairros que pertencem a esta cidade, remova-os primeiro.");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(cidade));
    }
}
