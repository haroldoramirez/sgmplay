package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.PagingList;
import com.avaje.ebean.Query;
import models.stock.UnidadeDeMedida;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;
import java.util.List;

public class UnidadeDeMedidaController extends Controller {


    //Salva pais no banco de dados
    public static Result inserir() {
        Logger.info("Salvando Unidade de Medida");

        UnidadeDeMedida unidadeDeMedida = Json.fromJson(request().body().asJson(), UnidadeDeMedida.class);

        UnidadeDeMedida unidadeBusca = Ebean.find(UnidadeDeMedida.class).where().eq("nome", unidadeDeMedida.getNome()).findUnique();

        if (unidadeBusca != null) {
            return badRequest("Unidade de Medida já esta cadastrado");
        }

        try {
            Ebean.save(unidadeDeMedida);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(unidadeDeMedida));
    }

    //Atualiza pais do banco de dados
    public static Result atualizar(Long id) {
        Logger.info("Atualizando Unidade de Medida");

        UnidadeDeMedida unidadeDeMedida = Json.fromJson(request().body().asJson(), UnidadeDeMedida.class);

        UnidadeDeMedida unidadeBusca = Ebean.find(UnidadeDeMedida.class, id);

        if (unidadeBusca == null) {
            return notFound(" Unidade de Medida não encontrado");
        }

        try {
            Ebean.update(unidadeDeMedida);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(unidadeDeMedida));
    }

    //Busca pais por ID
    public static Result buscaPorId(Long id) {
        Logger.info("Buscando Unidade de Medida por ID");

        UnidadeDeMedida unidadeBusca = Ebean.find(UnidadeDeMedida.class, id);

        if (unidadeBusca == null) {
            return notFound(" Unidade de Medida não encontrado");
        }

        return ok(Json.toJson(unidadeBusca));
    }

    //busca os paises em ordem
    public static Result buscaTodos() {
        Logger.info("Busca todas as Unidades de Medidas");

        return ok(Json.toJson(Ebean.find(UnidadeDeMedida.class)
                .order()
                .asc("nome")
                .findList()));
    }

    //Remove pais do banco de dados
    public static Result remover(Long id) {
        Logger.info("Remover Unidade de Medida");

        UnidadeDeMedida unidadeBusca = Ebean.find(UnidadeDeMedida.class, id);

        if (unidadeBusca == null) {
            return notFound(" Unidade de Medida não encontrado");
        }

        try {
            Ebean.delete(unidadeBusca);
        } catch (PersistenceException e) {
            return badRequest("Existem Produtos que dependem desta Unidade de Medida, remova-os primeiro");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(unidadeBusca));
    }

    //filtra pais por nome
    public static Result filtraPorNome(String filtro) {
        Logger.info("Filtrando Unidade de Medida por nome");

        //busca contato atraves do nome que recebe por parametro e onde o dono é o usuario logado no sistema
        Query<UnidadeDeMedida> query = Ebean.createQuery(UnidadeDeMedida.class, "find pais where (nome like :nome)");
        query.setParameter("nome", "%" + filtro + "%");
        List<UnidadeDeMedida> filtroDeUnidadesDeMedidas = query.findList();

        return ok(Json.toJson(filtroDeUnidadesDeMedidas));
    }
}
