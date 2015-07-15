package controllers;


import com.avaje.ebean.Ebean;
import com.avaje.ebean.Query;
import models.locale.Pais;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;
import java.util.List;

public class PaisController extends Controller {

    //Salva pais no banco de dados
    public static Result inserir() {
        Logger.info("Salvando País");

        Pais pais = Json.fromJson(request().body().asJson(), Pais.class);

        Pais paisBusca = Ebean.find(Pais.class).where().eq("nome", pais.getNome()).findUnique();

        if (paisBusca != null) {
            return badRequest("País já esta cadastrado");
        }

        try {
            Ebean.save(pais);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(pais));
    }

    //Atualiza pais do banco de dados
    public static Result atualizar(Long id) {
        Logger.info("Atualizando País");

        Pais pais = Json.fromJson(request().body().asJson(), Pais.class);

        Pais paisBusca = Ebean.find(Pais.class, id);

        if (paisBusca == null) {
            return notFound("País não encontrado");
        }

        try {
            Ebean.update(pais);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(pais));
    }

    //Busca pais por ID
    public static Result buscaPorId(Long id) {
        Logger.info("Buscando País por ID");

        Pais pais = Ebean.find(Pais.class, id);

        if (pais == null) {
            return notFound("País não encontrado");
        }

        return ok(Json.toJson(pais));
    }

    //busca os paises em ordem
    public static Result buscaTodos() {
        Logger.info("Busca todos os Países");

        return ok(Json.toJson(Ebean.find(Pais.class)
                .order()
                .asc("nome")
                .findList()));
    }

    //Remove pais do banco de dados
    public static Result remover(Long id) {
        Logger.info("Remover País");

        Pais pais = Ebean.find(Pais.class, id);

        if (pais == null) {
            return notFound("País não encontrado");
        }

        try {
            Ebean.delete(pais);
        } catch (PersistenceException e) {
            return badRequest("Existem Estados que dependem deste País, remova-os primeiro");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(pais));
    }

    //filtra pais por nome
    public static Result filtraPorNome(String filtro) {
        Logger.info("Filtrando País por nome");

        //busca contato atraves do nome que recebe por parametro e onde o dono é o usuario logado no sistema
        Query<Pais> query = Ebean.createQuery(Pais.class, "find pais where (nome like :nome or ddi like :ddiPais)");
        query.setParameter("nome", "%" + filtro + "%");
        query.setParameter("ddiPais", "%" + filtro + "%");
        List<Pais> filtroDePaises = query.findList();

        return ok(Json.toJson(filtroDePaises));
    }
}
