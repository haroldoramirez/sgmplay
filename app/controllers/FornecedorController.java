package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.PagingList;
import models.Fornecedor;
import models.locale.Bairro;
import play.Logger;
import play.api.libs.concurrent.Execution;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import validators.ValidaCNPJ;

import javax.persistence.PersistenceException;
import java.util.Calendar;
import java.util.List;

public class FornecedorController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Fornecedor");

        ValidaCNPJ validaCNPJ = new ValidaCNPJ();

        Fornecedor fornecedor = Json.fromJson(request().body().asJson(), Fornecedor.class);

        Bairro bairro = Ebean.find(Bairro.class, fornecedor.getBairro().getId());

        fornecedor.setBairro(bairro);

        if (!validaCNPJ.isCNPJ(fornecedor.getCnpj())) {
            return badRequest("CNPJ Inválido");
        }

        try {
            Ebean.save(fornecedor);
        } catch (PersistenceException e) {
            return badRequest("Fornecedor já Cadastrado");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        fornecedor.setDataDeCadastro(Calendar.getInstance());
        return created(Json.toJson(fornecedor));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Fornecedor");

        ValidaCNPJ validaCNPJ = new ValidaCNPJ();

        Fornecedor fornecedor = Json.fromJson(request().body().asJson(), Fornecedor.class);

        Bairro bairro = Ebean.find(Bairro.class, fornecedor.getBairro().getId());

        fornecedor.setBairro(bairro);

        if (!validaCNPJ.isCNPJ(fornecedor.getCnpj())) {
            return badRequest("CNPJ Inválido");
        }

        try {
            Ebean.update(fornecedor);
        } catch (PersistenceException e) {
            return badRequest("Fornecedor já Cadastrado");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(fornecedor));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId Fornecedor");

        Fornecedor fornecedor = Ebean.find(Fornecedor.class, id);

        if (fornecedor == null) {
            return notFound("Fornecedor não Encontrado");
        }

        return ok(Json.toJson(fornecedor));
    }

    public static Result buscaTodos() {
        Logger.info("busca Todos os Fornecedores ordenados");
        return ok(Json.toJson(Ebean.find(Fornecedor.class)
                .order()
                .asc("nomeFantasia")
                .where()
                .gt("nomeFantasia", "2")
                .setMaxRows(14)
                .findList()));
    }

    //Mostrar acima de 14 linhas
    public static Result buscaPorPaginas(Integer pagina) {
        Logger.info("busca por página");

        PagingList<Fornecedor> pagingList =
                Ebean.find(Fornecedor.class)
                        .order()
                        .asc("nomeFantasia")
                        .where().gt("nomeFantasia", "2")
                        .findPagingList(14).setFetchAhead(true);

        pagingList.getFutureRowCount();

        Page<Fornecedor> page = pagingList.getPage(pagina);

        List<Fornecedor> list = page.getList();

        return ok(Json.toJson(list));
    }

    public static Result remover(Integer id) {
        Logger.info("remover Fornecedor");

        Fornecedor fornecedor = Ebean.find(Fornecedor.class, id);

        if (fornecedor == null) {
            return notFound("Fornecedor não encontrado");
        }

        try {
            Ebean.delete(fornecedor);
        } catch (PersistenceException e) {
            return badRequest("Existem Produtos que dependem deste Fornecedor");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(fornecedor));
    }


}
