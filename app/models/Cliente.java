package models;

import models.locale.Bairro;
import play.db.ebean.Model;
import play.libs.Json;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "cliente")
public class Cliente extends Model {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String telefone;

    @Column(unique = true)
    private String cpf;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datanascimento")
    private Calendar dataNascimento;

    @Enumerated(EnumType.STRING)
    @Column(name="genero")
    private Genero genero;

    @Enumerated(EnumType.STRING)
    @Column(name="situacao")
    private Situacao situacao;

    //muitos clientes tem um bairro
    @ManyToOne(optional = true)
    private Bairro bairro;

    private String rg;

    private String email;

    private String celular;

    private String rua;

    private String numero;

    private String cep;

    private String complemento;

    private String observacoes;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Calendar dataDeCadastro;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Calendar dataDeAlteracao;

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

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return Json.toJson(this).toString();
    }
}
