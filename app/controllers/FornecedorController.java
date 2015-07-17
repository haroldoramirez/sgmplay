package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.PagingList;
import com.avaje.ebean.Query;
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

        Fornecedor Fornecedor = Json.fromJson(request().body().asJson(), Fornecedor.class);

        Fornecedor FornecedorBuscaCpf = Ebean.find(Fornecedor.class).where().eq("cnpj", Fornecedor.getCnpj()).findUnique();

        if (FornecedorBuscaCpf != null) {
            return badRequest("O Fornecedor já esta cadastrado");
        }

        Bairro bairro = Ebean.find(Bairro.class, Fornecedor.getBairro().getId());

        Fornecedor.setBairro(bairro);

        ValidaCNPJ validaCNPJ = new ValidaCNPJ();

        if (!validaCNPJ.isCNPJ(Fornecedor.getCnpj())) {
            return badRequest("O CNPJ é Inválido");
        }

        Fornecedor.setDataDeCadastro(Calendar.getInstance());

        try {
            Ebean.save(Fornecedor);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(Fornecedor));
    }

    public static Result atualizar(Long id) {
        Logger.info("Atualizando Fornecedor");

        Fornecedor Fornecedor = Json.fromJson(request().body().asJson(), Fornecedor.class);

        Fornecedor FornecedorBusca = Ebean.find(Fornecedor.class, id);

        if (FornecedorBusca == null) {
            return notFound("O Fornecedor não foi encontrado");
        }

        ValidaCNPJ validaCNPJ = new ValidaCNPJ();

        if (!validaCNPJ.isCNPJ(Fornecedor.getCnpj())) {
            return badRequest("O CNPJ é Inválido");
        }

        Bairro bairro = Ebean.find(Bairro.class, Fornecedor.getBairro().getId());

        Fornecedor.setBairro(bairro);

        Fornecedor.setDataDeAlteracao(Calendar.getInstance());

        try {
            Ebean.update(Fornecedor);
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(Fornecedor));
    }

    public static Result buscaPorId(Long id) {
        Logger.info("Buscando Fornecedor por ID");

        Fornecedor Fornecedor = Ebean.find(Fornecedor.class, id);

        if (Fornecedor == null) {
            return notFound("Fornecedor não Encontrado");
        }

        return ok(Json.toJson(Fornecedor));
    }

    public static Result buscaTodos() {
        Logger.info("Busca todos os Fornecedores");

        return ok(Json.toJson(Ebean.find(Fornecedor.class)
                .order()
                .asc("nomeFantasia")
                .findList()));
    }

    public static Result remover(Long id) {
        Logger.info("Remover Fornecedor");

        Fornecedor Fornecedor = Ebean.find(Fornecedor.class, id);

        if (Fornecedor == null) {
            return notFound("Fornecedor não encontrado");
        }

        try {
            Ebean.delete(Fornecedor);
        } catch (PersistenceException e) {
            return badRequest("Existem Vendas que dependem deste Fornecedor");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(Fornecedor));
    }

    public static Result filtraPorNome(String filtro) {
        Logger.info("Filtrando Fornecedor");

        Query<Fornecedor> query = Ebean.createQuery(Fornecedor.class, "find fornecedor where (nomeFantasia like :nomeFantasia or cnpj like :cnpj)");
        query.setParameter("nomeFantasia", "%" + filtro + "%");
        query.setParameter("cnpj", "%" + filtro + "%");
        List<Fornecedor> filtroDeFornecedores = query.findList();
        return ok(Json.toJson(filtroDeFornecedores));
    }

}
