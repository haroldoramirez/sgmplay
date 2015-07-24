package models.purchase;

import play.db.ebean.Model;

import javax.persistence.*;

@Entity
@Table(name = "itemcompra")
public class ItemCompra extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
