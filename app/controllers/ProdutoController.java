package controllers;

import com.avaje.ebean.Ebean;
import models.Fornecedor;
import models.stock.Categoria;
import models.stock.Fabricante;
import models.stock.Produto;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;

public class ProdutoController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Produto");

        Produto produto = Json.fromJson(request().body().asJson(), Produto.class);

        Categoria categoria = Ebean.find(Categoria.class, produto.getCategoria().getId());
        Fabricante fabricante = Ebean.find(Fabricante.class, produto.getFabricante().getId());
        Fornecedor fornecedor = Ebean.find(Fornecedor.class, produto.getFornecedor().getId());

        produto.setCategoria(categoria);
        produto.setFabricante(fabricante);
        produto.setFornecedor(fornecedor);

        try{
            Ebean.save(produto);
        } catch (PersistenceException e) {
            return badRequest("Produto já Cadastrado");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(produto));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Produto");

        Produto produto = Json.fromJson(request().body().asJson(), Produto.class);

        Categoria categoria = Ebean.find(Categoria.class, produto.getCategoria().getId());
        Fabricante fabricante = Ebean.find(Fabricante.class, produto.getFabricante().getId());
        Fornecedor fornecedor = Ebean.find(Fornecedor.class, produto.getFornecedor().getId());

        produto.setCategoria(categoria);
        produto.setFabricante(fabricante);
        produto.setFornecedor(fornecedor);

        Ebean.update(produto);

        return created(Json.toJson(produto));
    }

    public static Result buscaPorId(Integer id) {
        Logger.info("buscaPorId Produto");

        Produto produto = Ebean.find(Produto.class, id);

        if (produto == null) {
            return notFound("Produto não encontrado");
        }

        return ok(Json.toJson(produto));
    }

    public static Result buscaTodos() {
        Logger.info("busca Todos os Produtos");
        return ok(Json.toJson(Ebean.find(Produto.class).findList()));
    }

    public static Result remover(Integer id) {
        Logger.info("remover Produto");

        Produto produto = Ebean.find(Produto.class, id);

        if (produto == null) {
            return notFound("Produto não encontrado");
        }

        try {
            Ebean.delete(produto);
        } catch (PersistenceException e) {
            return badRequest("Existem vendas que dependem deste produto");
        } catch (Exception e) {
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(produto));
    }
}
