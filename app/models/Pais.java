package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;
import play.libs.Json;

import javax.persistence.*;

@Entity
@Table(name = "pais")
public class Pais extends Model{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Constraints.Required(message = "Você precisa inserir o nome do País")
    @Column(name = "nome", nullable = false, unique = true)
    private String nome;

    @Column(name = "ddi")
    private String ddi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    @Override
    public String toString() {
        return Json.toJson(this).toString();
    }
}