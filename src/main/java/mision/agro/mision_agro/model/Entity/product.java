package mision.agro.mision_agro.model.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
// JPA
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "producto")
public class product {

    @Id
    @Getter @Setter @Column(name = "producto_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter @Setter @Column(name = "nombre")
    private String nombre;

    @Getter @Setter @Column(name = "descripcion")
    private String descripcion;

    @OneToOne
    @JoinColumn(name = "imagen_id") 
    private image imagen;

    @ManyToOne(fetch = FetchType.LAZY,
        cascade = CascadeType.ALL)
    @JoinColumn(name = "categoria_id")
    private category categoria;

    
    @ManyToMany(fetch = FetchType.LAZY, 
        cascade = CascadeType.ALL)
    @JoinTable(name = "producto_login_usuario", 
        joinColumns=@JoinColumn(name="product_id"), 
        inverseJoinColumns=@JoinColumn(name="user_id"))
    private List<user> usuario;

}
