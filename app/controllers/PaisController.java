package controllers;

import com.avaje.ebean.Ebean;
import models.locale.Pais;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class PaisController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Pais");

        Pais pais = Json.fromJson(request().body().asJson(), Pais.class);

        try{
            Ebean.save(pais);
        }catch (Exception e) {
            System.out.println(e.getCause().getLocalizedMessage().toString());
            if (e.getCause().getLocalizedMessage().toString().equals("Duplicate entry 'Brasil' for key 'uq_pais_nome'")) {
                return badRequest("País já Cadastrado");
            } else {
                return badRequest("Erro interno de sistema");
            }
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
        Logger.info("buscaPorId País");

        Pais pais = Ebean.find(Pais.class, id);

        if (pais == null) {
            return notFound(Json.toJson("pais nao encontrado"));
        }

        return ok(Json.toJson(pais));
    }

    public static Result buscaTodos() {
        Logger.info("busca Todos os Paises");
        return ok(Json.toJson(Ebean.find(Pais.class).findList()));
    }

    public static Result remover(Integer id) {
        Logger.info("remover pais");

        Pais pais = Ebean.find(Pais.class, id);

        if (pais == null) {
            return notFound("País não encontrado");
        }

        try {
            Ebean.delete(pais);
        } catch (Exception e){
            System.out.println(e.getCause().getLocalizedMessage().toString());
            if (e.getCause().getLocalizedMessage().toString().equals("Cannot delete or update a parent row: a foreign key constraint fails (`sgmplaydb`.`estado`, CONSTRAINT `fk_estado_pais_4` FOREIGN KEY (`pais_id`) REFERENCES `pais` (`id`))")) {
                return badRequest("Existem pessoas que residem neste país, remova-os primeiro.");
            } else {
                return badRequest("Erro interno de sistema");
            }
        }

        return ok(Json.toJson(pais));
    }
}
