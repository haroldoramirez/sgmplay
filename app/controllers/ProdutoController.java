package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.PagingList;
import models.Fornecedor;
import models.stock.Categoria;
import models.stock.Fabricante;
import models.stock.Produto;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;
import java.util.List;

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

        if (produto.getQuantidadeMinima() > produto.getQuantidadeEmEstoque()) {
            return badRequest("Quantidade Mínima deve ser menor que Quantidade em Estoque");
        }
        
        if (produto.getPrecoDeCusto() > produto.getPrecoDeVenda()) {
            return badRequest("Preço de Custo deve ser menor que o Preço de Venda");
        }

        try {
            Ebean.save(produto);
        } catch (PersistenceException e) {
            System.out.print(e.toString());
            return badRequest("Produto já Cadastrado");
        } catch (Exception e) {
            System.out.print(e.toString());
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

        if (produto.getQuantidadeMinima() > produto.getQuantidadeEmEstoque()) {
            return badRequest("Quantidade Mínima deve ser menor que Quantidade em Estoque");
        }

        if (produto.getPrecoDeCusto() > produto.getPrecoDeVenda()) {
            return badRequest("Preço de Custo deve ser menor que o Preço de Venda");
        }
        
        
        try {
            Ebean.update(produto);
        } catch (Exception e) {
            System.out.print(e.toString());
            return badRequest("Erro interno de sistema");
        }
        
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
        Logger.info("busca Todos os Produtos ordenados");
        return ok(Json.toJson(Ebean.find(Produto.class)
                .order()
                .asc("descricao")
                .where()
                .gt("descricao", "2")
                .setMaxRows(14)
                .findList()));
    }

    //Mostrar acima de 14 linhas
    public static Result buscaPorPaginas(Integer pagina) {
        Logger.info("busca por página");

        PagingList<Produto> pagingList =
                Ebean.find(Produto.class)
                        .order()
                        .asc("descricao")
                        .where().gt("descricao", "2")
                        .findPagingList(14).setFetchAhead(true);

        pagingList.getFutureRowCount();

        Page<Produto> page = pagingList.getPage(pagina);

        List<Produto> list = page.getList();

        return ok(Json.toJson(list));
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
            System.out.print(e.toString());
            return badRequest("Existem vendas que dependem deste produto");
        } catch (Exception e) {
            System.out.print(e.toString());
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(produto));
    }
}
