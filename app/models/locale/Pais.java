package models.locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import com.wordnik.swagger.annotations.ApiModel;
//import com.wordnik.swagger.annotations.ApiModelProperty;
import play.db.ebean.Model;
import play.libs.Json;

@Entity
@Table(name = "pais")
//@ApiModel(value = "Aluno", description = "Representação do País")
public class Pais extends Model {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @ApiModelProperty( value = "Nome do País", required = true )
    @Column(nullable = false, unique = true)
    private String nome;

//    @ApiModelProperty( value = "Discagem Internacional")
    private String ddi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    @ApiModelProperty(position = 1, required = true)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    @ApiModelProperty(position = 2, required = true)
    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public static Model.Finder<Long,Pais> find = new Model.Finder<Long,Pais>(Long.class,Pais.class);

    @Override
    public String toString() {
        return Json.toJson(this).toString();
    }
}