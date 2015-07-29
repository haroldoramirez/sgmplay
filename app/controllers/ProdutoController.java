package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;
import com.avaje.ebean.PagingList;
import com.avaje.ebean.Query;
import models.Fornecedor;
import models.stock.Categoria;
import models.stock.Fabricante;
import models.stock.Produto;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.PersistenceException;
import java.util.Calendar;
import java.util.List;

public class ProdutoController extends Controller {

    public static Result inserir() {
        Logger.info("Salvando Produto");

        Produto produto = Json.fromJson(request().body().asJson(), Produto.class);

        Produto produtoBusca = Ebean.find(Produto.class).where().eq("descricao", produto.getDescricao()).findUnique();

        if (produtoBusca != null) {
            return badRequest("Produto já cadastrado");
        }

        if ((produto.getQuantidade() <= 0)){
            return badRequest("Quantidade Não Pode Ser Negativa");
        }
        
        if (produto.getPrecoCompra() > produto.getPrecoVenda()) {
            return badRequest("Preço de Compra deve ser menor que o Preço de Venda");
        }

        Categoria categoria = Ebean.find(Categoria.class, produto.getCategoria().getId());
        Fabricante fabricante = Ebean.find(Fabricante.class, produto.getFabricante().getId());
        Fornecedor fornecedor = Ebean.find(Fornecedor.class, produto.getFornecedor().getId());

        produto.setCategoria(categoria);
        produto.setFabricante(fabricante);
        produto.setFornecedor(fornecedor);

        produto.setDataCadastro(Calendar.getInstance());
        produto.setDataAlteracao(Calendar.getInstance());

        try {
            Ebean.save(produto);
        } catch (Exception e) {
            //System.out.print(e.toString());
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(produto));
    }

    public static Result atualizar(Integer id) {
        Logger.info("Atualizando Produto");

        Produto produto = Json.fromJson(request().body().asJson(), Produto.class);

        Produto produtoBusca = Ebean.find(Produto.class, id);

        if (produtoBusca == null) {
            return notFound("Produto não encontrado");
        }

        if ((produto.getQuantidade() <= 0)){
            return badRequest("Quantidade Não Pode Ser Negativa");
        }

        if (produto.getPrecoCompra() > produto.getPrecoVenda()) {
            return badRequest("Preço de Compra deve ser menor que o Preço de Venda");
        }

        Categoria categoria = Ebean.find(Categoria.class, produto.getCategoria().getId());
        Fabricante fabricante = Ebean.find(Fabricante.class, produto.getFabricante().getId());
        Fornecedor fornecedor = Ebean.find(Fornecedor.class, produto.getFornecedor().getId());

        produto.setCategoria(categoria);
        produto.setFabricante(fabricante);
        produto.setFornecedor(fornecedor);

        produto.setDataAlteracao(Calendar.getInstance());

        try {
            Ebean.update(produto);
        } catch (Exception e) {
            //System.out.print(e.toString());
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
        Logger.info("busca Todos os Produtos");

        return ok(Json.toJson(Ebean.find(Produto.class)
                .order()
                .asc("descricao")
                .findList()));
    }

    public static Result remover(Integer id) {
        Logger.info("Remover Produto");

        Produto produto = Ebean.find(Produto.class, id);

        if (produto == null) {
            return notFound("Produto não encontrado");
        }

        produto.setDataAlteracao(null);

        try {
            Ebean.delete(produto);
        } catch (PersistenceException e) {
            //System.out.print(e.toString());
            return badRequest("Existem vendas que dependem deste produto");
        } catch (Exception e) {
            //System.out.print(e.toString());
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(produto));
    }

    public static Result filtraPorNome(String filtro) {
        Logger.info("Filtrando Produto por nome");

        Query<Produto> query = Ebean.createQuery(Produto.class, "find produto where (descricao like :descricao or codigoBarras like :codigoBarras)");
        query.setParameter("descricao", "%" + filtro + "%");
        query.setParameter("codigoBarras", "%" + filtro + "%");
        List<Produto> filtroDeProdutos = query.findList();
        return ok(Json.toJson(filtroDeProdutos));
    }
}
