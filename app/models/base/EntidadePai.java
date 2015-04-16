package models.base;

import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;

@Entity
public class EntidadePai extends Model {

    private static final long serialVersionUID = 1L;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    protected Calendar dataDeCadastro = Calendar.getInstance();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    protected Calendar dataDeAlteracao = Calendar.getInstance();

    protected Boolean padraoDoSistema;

    public Boolean isPadraoDoSistema() {
        return padraoDoSistema;
    }

    public void setPadraoDoSistema(Boolean padraoDoSistema) {
        this.padraoDoSistema = padraoDoSistema;
    }

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
}
