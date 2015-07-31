package controllers;

import actions.PlayAuthenticatedSecured;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.Query;
import models.Fornecedor;
import models.stock.Categoria;
import models.stock.Fabricante;
import models.stock.Produto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.persistence.PersistenceException;
import java.util.Calendar;
import java.util.Formatter;
import java.util.List;

public class ProdutoController extends Controller {

    static Logger logger = LoggerFactory.getLogger(ProdutoController.class);

    static LogController logController = new LogController();


    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result inserir() {

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);

        String username = session().get("email");

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
            logger.info("Criado um novo produto: {}", produto.getDescricao());
            formatter.format("Conta: '%1s' cadastrou um produto: '%2s'", username, produto.getDescricao());
            logController.inserir(sb.toString());
        } catch (Exception e) {
            //System.out.print(e.toString());
            return badRequest("Erro interno de sistema");
        }

        return created(Json.toJson(produto));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result atualizar(Long id) {

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);

        String username = session().get("email");

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
            logger.info("Produto: '{}' atualizado", produto.getDescricao());
            formatter.format("Conta: '%1s' atualizou o produto: '%2s'", username, produto.getDescricao());
            logController.inserir(sb.toString());
        } catch (Exception e) {
            //System.out.print(e.toString());
            return badRequest("Erro interno de sistema");
        }
        
        return created(Json.toJson(produto));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result buscaPorId(Long id) {

        Produto produto = Ebean.find(Produto.class, id);

        if (produto == null) {
            return notFound("Produto não encontrado");
        }

        return ok(Json.toJson(produto));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result buscaTodos() {

        return ok(Json.toJson(Ebean.find(Produto.class)
                .order()
                .asc("descricao")
                .findList()));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result remover(Long id) {

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);

        String username = session().get("email");

        Produto produto = Ebean.find(Produto.class, id);

        if (produto == null) {
            return notFound("Produto não encontrado");
        }

        produto.setDataAlteracao(null);

        try {
            Ebean.delete(produto);
            logger.info("Produto deletado");
            formatter.format("Conta: '%1s' deletou um produto", username);
            logController.inserir(sb.toString());
        } catch (PersistenceException e) {
            //System.out.print(e.toString());
            return badRequest("Existem vendas que dependem deste produto");
        } catch (Exception e) {
            //System.out.print(e.toString());
            return badRequest("Erro interno de sistema");
        }

        return ok(Json.toJson(produto));
    }

    @Security.Authenticated(PlayAuthenticatedSecured.class)
    public static Result filtraPorNome(String filtro) {

        Query<Produto> query = Ebean.createQuery(Produto.class, "find produto where (descricao like :descricao or codigoBarras like :codigoBarras)");
        query.setParameter("descricao", "%" + filtro + "%");
        query.setParameter("codigoBarras", "%" + filtro + "%");
        List<Produto> filtroDeProdutos = query.findList();
        return ok(Json.toJson(filtroDeProdutos));
    }
}
