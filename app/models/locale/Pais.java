package models.locale;

import play.db.ebean.Model;
import play.libs.Json;

import javax.persistence.*;

@Entity
@Table(name = "pais")
public class Pais extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String nome;

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