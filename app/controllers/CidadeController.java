package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Query;
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

        Cidade cidadeBusca = Ebean.find(Cidade.class).where().eq("nome", cidade.getNome()).findUnique();

        if (cidadeBusca != null) {
            return badRequest("Cidade já esta cadastrada");
        }

        Estado estado = Ebean.find(Estado.class, cidade.getEstado().getId());

        cidade.setEstado(estado);

        try {
            Ebean.save(cidade);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(cidade));
    }

    public static Result atualizar(Long id) {
        Logger.info("Atualizando Estado");

        Cidade cidade = Json.fromJson(request().body().asJson(), Cidade.class);

        Cidade cidadeBusca = Ebean.find(Cidade.class, id);

        if (cidadeBusca == null) {
            return notFound("Cidade não encontrada");
        }

        Estado estado = Ebean.find(Estado.class, cidade.getEstado().getId());

        cidade.setEstado(estado);

        try {
            Ebean.update(cidade);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(cidade));
    }

    public static Result buscaPorId(Long id) {
        Logger.info("Buscando Cidade por ID");

        Cidade cidade = Ebean.find(Cidade.class, id);

        if (cidade == null) {
            return notFound("Cidade não encontrada");
        }

        return ok(Json.toJson(cidade));
    }

    public static Result buscaTodos() {
        Logger.info("Busca todos os Estados");

        return ok(Json.toJson(Ebean.find(Cidade.class)
                .order()
                .asc("nome")
                .findList()));
    }

    public static Result remover(Long id) {
        Logger.info("Remover Estado");

        Cidade cidade = Ebean.find(Cidade.class, id);

        if (cidade == null) {
            return notFound("Cidade não encontrada");
        }

        try {
            Ebean.delete(cidade);
        } catch (PersistenceException e) {
            return badRequest("Existem Bairros que dependem desta Cidade, remova-os primeiro");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(cidade));
    }

    public static Result filtraPorNome(String filtro) {
        Logger.info("Filtrando Cidade por nome");

        Query<Cidade> query = Ebean.createQuery(Cidade.class, "find cidade where (nome like :nome or estado.nome like :estadoNome)");
        query.setParameter("nome", "%" + filtro + "%");
        query.setParameter("estadoNome", "%" + filtro + "%");
        List<Cidade> filtroDeCidades = query.findList();
        return ok(Json.toJson(filtroDeCidades));
    }
}
