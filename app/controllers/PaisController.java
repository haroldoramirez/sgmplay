package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.PagingList;
//import com.wordnik.swagger.annotations.Api;
//import com.wordnik.swagger.annotations.ApiOperation;
//import com.wordnik.swagger.annotations.ApiResponse;
//import com.wordnik.swagger.annotations.ApiResponses;
import models.locale.Pais;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;
//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.List;

//@Api(value = "/paises", description = "País Controller")
public class PaisController extends Controller {

//    @POST
//    @Path("/paises")
//    @ApiOperation(value = "Adiciona um país na base da dados", response = Boolean.class, httpMethod = "POST")
//    @Produces({MediaType.APPLICATION_JSON})
//    @ApiResponses(value = {
//            @ApiResponse(code = 201, message = "Cadastrado com sucesso", response = Pais.class),
//            @ApiResponse(code = 400, message = "País já cadastrado"),
//            @ApiResponse(code = 500, message = "Erro interno de sistema")}
//    )
    public static Result inserir() {
        Logger.info("Salvando Pais");

        Pais pais = Json.fromJson(request().body().asJson(), Pais.class);

        Pais paisBusca = Ebean.find(Pais.class).where().eq("nome", pais.getNome()).findUnique();

        if (paisBusca != null) {
            return badRequest("País já Cadastrado");
        }

        try {
            Ebean.save(pais);
        } catch (Exception e) {
            return internalServerError("Erro interno de sistema");
        }

        return created(Json.toJson(pais));
    }

//    @PUT
//    @Path("/paises")
//    @ApiOperation(value = "Atualiza os dados de um país existente", response = Boolean.class, httpMethod = "PUT")
//    @Produces({MediaType.APPLICATION_JSON})
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Atualizado com sucesso", response = Pais.class),
//            @ApiResponse(code = 400, message = "País já cadastrado"),
//            @ApiResponse(code = 500, message = "Erro interno de sistema")}
//    )
    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Pais");

        Pais pais = Json.fromJson(request().body().asJson(), Pais.class);


        try {
            Ebean.update(pais);
        } catch (Exception e) {
            return internalServerError("Erro interno de sistema");
        }

        return ok(Json.toJson(pais));
    }

//    @GET
//    @Path("/paises")
//    @ApiOperation(value = "Busca o país por ID", response = Boolean.class, httpMethod = "GET")
//    @Produces({MediaType.APPLICATION_JSON})
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "País encontrado"),
//            @ApiResponse(code = 404, message = "País não encontrado")}
//    )
    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId Pais");

        Pais pais = Ebean.find(Pais.class, id);

        if (pais == null) {
            return notFound("País não encontrado");
        }

        return ok(Json.toJson(pais));
    }

//    @GET
//    @Path("/paises")
//    @ApiOperation(value = "Lista de 14 paises", response = Boolean.class, httpMethod = "GET")
//    @Produces({MediaType.APPLICATION_JSON})
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Lista de 14 paises")}
//    )
    public static Result buscaTodos() {
        Logger.info("busca Todos os Paises ordenados");
        return ok(Json.toJson(Ebean.find(Pais.class)
                .order()
                .asc("nome")
                .where()
                .gt("nome", "2")
                .setMaxRows(14)
                .findList()));
    }

    //Mostrar acima de 14 linhas
//    @GET
//    @Path("/paises")
//    @ApiOperation(value = "Página de 14 paises", response = Boolean.class, httpMethod = "GET")
//    @Produces({MediaType.APPLICATION_JSON})
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Página de 14 paises")}
//    )
    public static Result buscaPorPaginas(Integer pagina) {
        Logger.info("busca por página");

        PagingList<Pais> pagingList =
                Ebean.find(Pais.class)
                        .order()
                        .asc("nome")
                        .where().gt("nome", "2")
                        .findPagingList(14).setFetchAhead(true);

        pagingList.getFutureRowCount();

        Page<Pais> page = pagingList.getPage(pagina);

        List<Pais> list = page.getList();

        return ok(Json.toJson(list));
    }

//    @DELETE
//    @Path("/paises")
//    @ApiOperation(value = "Remove o país", response = Boolean.class, httpMethod = "DELETE")
//    @Produces({MediaType.APPLICATION_JSON})
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Removido com sucesso", response = Pais.class),
//            @ApiResponse(code = 404, message = "País não encontrado"),
//            @ApiResponse(code = 400, message = "Não foi possível remover o país"),
//            @ApiResponse(code = 500, message = "Erro interno de sistema")}
//    )
    public static Result remover(Integer id) {
        Logger.info("remover pais");

        Pais pais = Ebean.find(Pais.class, id);

        if (pais == null) {
            return notFound("País não encontrado");
        }

        try {
            Ebean.delete(pais);
        } catch (PersistenceException e) {
            return badRequest("Existem estados que pertencem a este país, remova-os primeiro.");

        } catch (Exception e) {
            return internalServerError("Erro interno de sistema");
        }

        return ok(Json.toJson(pais));
    }
}
