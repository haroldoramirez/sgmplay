package models.purchase;

import models.Fornecedor;
import models.Usuario;
import play.db.ebean.Model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Calendar;

@Entity
@Table(name = "compra")
public class Compra extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Calendar dataCompra = Calendar.getInstance();

    @Column(nullable = false, precision = 14, scale = 2)
    private BigDecimal total;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private StatusCompra status;

    @ManyToOne
    @Column(nullable = false)
    private Fornecedor fornecedor;

    @ManyToOne
    @Column(nullable = false)
    private Usuario funcionario;

    private ItemCompra itensCompra;

}
