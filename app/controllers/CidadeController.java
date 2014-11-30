package controllers;

import com.avaje.ebean.Ebean;
import models.locale.Cidade;
import models.locale.Estado;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class CidadeController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Cidade");

        Cidade cidade = Json.fromJson(request().body().asJson(), Cidade.class);

        Estado estado = Ebean.find(Estado.class, cidade.getEstado().getId());

        cidade.setEstado(estado);

        Ebean.save(cidade);

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
        Logger.info("busca Todas as Cidades");
        return ok(Json.toJson(Ebean.find(Cidade.class).findList()));
    }

    public static Result remover(Integer id) {
        Logger.info("remover cidade");

        Cidade cidade = Ebean.find(Cidade.class, id);

        if (cidade == null) {
            return notFound("Cidade não encontrada");
        }

        try {
            Ebean.delete(cidade);
        } catch (Exception e) {
            System.out.println(e.getCause().getLocalizedMessage().toString());
            if (e.getCause().getLocalizedMessage().toString().equals("Cannot delete or update a parent row: a foreign key constraint fails (`sgmplaydb`.`bairro`, CONSTRAINT `fk_bairro_cidade_1` FOREIGN KEY (`cidade_id`) REFERENCES `cidade` (`id`))")) {
                return badRequest("Restrição de Chave Estrangeira");
            } else {
                return badRequest(e.getCause().getLocalizedMessage().toString());
            }
        }

        return ok(Json.toJson(cidade));
    }
}
