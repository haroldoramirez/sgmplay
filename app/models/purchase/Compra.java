package models.purchase;

import models.Fornecedor;
import models.Usuario;
import play.db.ebean.Model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "compra")
public class Compra extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Calendar dataCompra;

    @Column(nullable = false)
    private Float total;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private StatusCompra status;

    @ManyToOne
    @Column(nullable = false)
    private Fornecedor fornecedor;

    @ManyToOne
    @Column(nullable = false)
    private Usuario funcionario;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Calendar dataAlteracao;

    //uma compra tem muitos itenscompra, o hashset utiliza hashtable e seus elementos não são ordenados, conhecido por aceitar valores únicos
    @OneToMany(fetch=FetchType.EAGER, cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval = true)
    @JoinColumn(referencedColumnName = "id", name = "compra_id")
    private Set<ItemCompra> itensCompra = new HashSet<ItemCompra>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Calendar dataCompra) {
        this.dataCompra = dataCompra;
    }


    public StatusCompra getStatus() {
        return status;
    }

    public void setStatus(StatusCompra status) {
        this.status = status;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Usuario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Usuario funcionario) {
        this.funcionario = funcionario;
    }

    public Calendar getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Calendar dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public Set<ItemCompra> getItensCompra() {
        return itensCompra;
    }

    public void setItensCompra(Set<ItemCompra> itensCompra) {
        this.itensCompra = itensCompra;
    }
}
