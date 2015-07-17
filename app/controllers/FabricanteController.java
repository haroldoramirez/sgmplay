package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.PagingList;
import com.avaje.ebean.Query;
import models.stock.Fabricante;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;
import java.util.Calendar;
import java.util.List;

public class FabricanteController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Fabricante");

        Fabricante fabricante = Json.fromJson(request().body().asJson(), Fabricante.class);

        Fabricante fabricanteBusca = Ebean.find(Fabricante.class).where().eq("nome", fabricante.getNome()).findUnique();

        if (fabricanteBusca != null) {
            return badRequest("Fabricante já esta cadastrado");
        }

        try {
            Ebean.save(fabricante);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(fabricante));
    }

    public static Result atualizar(Long id) {
        Logger.info("Atualizando Fabricante");

        Fabricante fabricante = Json.fromJson(request().body().asJson(), Fabricante.class);

        Fabricante fabricanteBusca = Ebean.find(Fabricante.class, id);

        if (fabricanteBusca == null) {
            return notFound(" Fabricante não encontrado");
        }

        try {
            Ebean.update(fabricante);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(fabricante));
    }

    public static Result buscaPorId(Long id) {
        Logger.info("Buscando Fabricante por ID");

        Fabricante fabricanteBusca = Ebean.find(Fabricante.class, id);

        if (fabricanteBusca == null) {
            return notFound(" Fabricante não encontrado");
        }

        return ok(Json.toJson(fabricanteBusca));
    }

    public static Result buscaTodos() {
        Logger.info("Busca todos os Fabricantes");

        return ok(Json.toJson(Ebean.find(Fabricante.class)
                .order()
                .asc("nome")
                .findList()));
    }
    
    public static Result remover(Long id) {
        Logger.info("Remover Fabricante");

        Fabricante fabricanteBusca = Ebean.find(Fabricante.class, id);

        if (fabricanteBusca == null) {
            return notFound(" Fabricante não encontrado");
        }

        try {
            Ebean.delete(fabricanteBusca);
        } catch (PersistenceException e) {
            return badRequest("Existem Produtos que dependem deste Fabricante, remova-os primeiro");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(fabricanteBusca));
    }
    
    public static Result filtraPorNome(String filtro) {
        Logger.info("Filtrando Fabricante por nome");
        
        Query<Fabricante> query = Ebean.createQuery(Fabricante.class, "find fabricante where (nome like :nome)");
        query.setParameter("nome", "%" + filtro + "%");
        List<Fabricante> filtroDeFabricantes = query.findList();

        return ok(Json.toJson(filtroDeFabricantes));
    }

}
