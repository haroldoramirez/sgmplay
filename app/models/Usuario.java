package models;

import models.base.EntidadePai;
import play.db.ebean.Model;
import play.libs.Json;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario extends EntidadePai {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private Integer privilegio;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(Integer privilegio) {
        this.privilegio = privilegio;
    }

    @Override
    public String toString() {
        return Json.toJson(this).toString();
    }
}
