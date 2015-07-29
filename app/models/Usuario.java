package models;

import play.db.ebean.Model;
import play.libs.Json;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "usuario")
public class Usuario extends Model {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private Integer privilegio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Calendar dataDeCadastro;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Calendar dataDeAlteracao;

    private Boolean padraoDoSistema;

    public Calendar getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(Calendar dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public Calendar getDataDeAlteracao() {
        return dataDeAlteracao;
    }

    public void setDataDeAlteracao(Calendar dataDeAlteracao) {
        this.dataDeAlteracao = dataDeAlteracao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Boolean getPadraoDoSistema() {
        return padraoDoSistema;
    }

    public void setPadraoDoSistema(Boolean padraoDoSistema) {
        this.padraoDoSistema = padraoDoSistema;
    }

    @Override
    public String toString() {
        return Json.toJson(this).toString();
    }
}
