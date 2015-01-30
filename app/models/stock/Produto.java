package models.stock;

import models.Fornecedor;
import play.db.ebean.Model;
import play.libs.Json;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "produto")
public class Produto extends Model {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String descricao;

    @Column(nullable = false)
    private Integer quantidadeMinima;

    @Column(nullable = false)
    private Integer quantidadeEmEstoque;

    @Column(nullable = false)
    private Float precoDeCusto;

    @Column(nullable = false)
    private Float precoDeVenda;

    private String codigoDeBarras;

    private String observacoes;

    @ManyToOne(optional = true)
    private Fornecedor fornecedor;

    @ManyToOne(optional = true)
    private Categoria categoria;

    @ManyToOne(optional = true)
    private Fabricante fabricante;

    @ManyToOne(optional = true)
    private UnidadeDeMedida unidadedemedida;

    @Version
    @Column(columnDefinition = "timestamp default '2014-10-06 21:17:06'")
    public Timestamp lastUpdate; // here

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(Integer quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Float getPrecoDeCusto() {
        return precoDeCusto;
    }

    public void setPrecoDeCusto(Float precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }

    public Float getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(Float precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public UnidadeDeMedida getUnidadedemedida() {
        return unidadedemedida;
    }

    public void setUnidadedemedida(UnidadeDeMedida unidadedemedida) {
        this.unidadedemedida = unidadedemedida;
    }

    @Override
    public String toString() {
        return Json.toJson(this).toString();
    }
}
