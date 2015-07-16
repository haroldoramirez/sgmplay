package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.PagingList;
import com.avaje.ebean.Query;
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

        Bairro bairroBusca = Ebean.find(Bairro.class).where().eq("nome", bairro.getNome()).findUnique();

        if (bairroBusca != null) {
            return badRequest("Bairro já esta cadastrado");
        }

        Cidade cidade = Ebean.find(Cidade.class, bairro.getCidade().getId());

        bairro.setCidade(cidade);

        try {
            Ebean.save(bairro);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(cidade));
    }

    public static Result atualizar(Long id) {
        Logger.info("Atualizando Bairro");

        Bairro bairro = Json.fromJson(request().body().asJson(), Bairro.class);

        Bairro bairroBusca = Ebean.find(Bairro.class, id);

        if (bairroBusca == null) {
            return notFound("Bairro não encontrado");
        }

        Cidade cidade = Ebean.find(Cidade.class, bairro.getCidade().getId());

        bairro.setCidade(cidade);

        try {
            Ebean.update(bairro);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(bairro));
    }

    public static Result buscaPorId(Long id) {
        Logger.info("Buscando Bairro por ID");

        Bairro bairro = Ebean.find(Bairro.class, id);

        if (bairro == null) {
            return notFound("Bairro não encontrado");
        }

        return ok(Json.toJson(bairro));
    }

    public static Result buscaTodos() {
        Logger.info("Busca todos os Bairros");

        return ok(Json.toJson(Ebean.find(Bairro.class)
                .order()
                .asc("nome")
                .findList()));
    }

    public static Result remover(Long id) {
        Logger.info("Remover Bairro");

        Bairro bairro = Ebean.find(Bairro.class, id);

        if (bairro == null) {
            return notFound("Bairro não encontrado");
        }

        try {
            Ebean.delete(bairro);
        } catch (PersistenceException e) {
            return badRequest("Existem Clientes que dependem deste Bairro, remova-os primeiro");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(bairro));
    }

    public static Result filtraPorNome(String filtro) {
        Logger.info("Filtrando Bairro por nome");

        Query<Bairro> query = Ebean.createQuery(Bairro.class, "find bairro where (nome like :nome or cidade.nome like :cidadeNome)");
        query.setParameter("nome", "%" + filtro + "%");
        query.setParameter("cidadeNome", "%" + filtro + "%");
        List<Bairro> filtroDeBairros = query.findList();
        return ok(Json.toJson(filtroDeBairros));
    }
}
