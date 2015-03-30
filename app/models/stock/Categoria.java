package models.stock;

import models.base.EntidadePai;
import play.libs.Json;

import javax.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria extends EntidadePai {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String descricao;

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

    @Override
    public String toString() {
        return Json.toJson(this).toString();
    }
}
