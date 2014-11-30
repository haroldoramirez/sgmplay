package controllers;

import com.avaje.ebean.Ebean;
import models.locale.Estado;
import models.locale.Pais;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class EstadoController extends Controller {


    public static Result inserir() {
        Logger.info("Salvando Estado");

        Estado estado = Json.fromJson(request().body().asJson(), Estado.class);

        Pais pais = Ebean.find(Pais.class, estado.getPais().getId());

        estado.setPais(pais);

        Ebean.save(estado);

        return created(Json.toJson(estado));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Estado");

        Estado estado = Json.fromJson(request().body().asJson(), Estado.class);

        Pais pais = Ebean.find(Pais.class, estado.getPais().getId());

        estado.setPais(pais);

        Ebean.update(estado);

        return ok(Json.toJson(estado));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId Estado");

        Estado estado = Ebean.find(Estado.class, id);

        if (estado == null) {
            return notFound(Json.toJson("Estado não encontrado"));
        }

        return ok(Json.toJson(estado));
    }

    public static Result buscaTodos() {
        Logger.info("busca Todos os Estados");
        return ok(Json.toJson(Ebean.find(Estado.class).findList()));
    }

    public static Result remover(Integer id) {
        Logger.info("remover estado");

        Estado estado = Ebean.find(Estado.class, id);

        if (estado == null) {
            return notFound("Estado não encontrado");
        }

        try {
            Ebean.delete(estado);
        } catch (Exception e) {
            System.out.println(e.getCause().getLocalizedMessage().toString());
            if (e.getCause().getLocalizedMessage().toString().equals("Cannot delete or update a parent row: a foreign key constraint fails (`sgmplaydb`.`cidade`, CONSTRAINT `fk_cidade_estado_2` FOREIGN KEY (`estado_id`) REFERENCES `estado` (`id`))")) {
                return badRequest("Restrição de Chave Estrangeira");
            } else {
                return badRequest(e.getCause().getLocalizedMessage().toString());
            }
        }

        return ok(Json.toJson(estado));
    }
}
