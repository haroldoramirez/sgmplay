package models.stock;

import play.db.ebean.Model;
import play.libs.Json;

import javax.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria extends Model {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return Json.toJson(this).toString();
    }
}
