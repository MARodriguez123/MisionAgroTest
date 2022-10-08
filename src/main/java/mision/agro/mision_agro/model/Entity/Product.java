package mision.agro.mision_agro.model.Entity;

import java.util.List;

import javax.persistence.Column;
// JPA
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Producto")
public class Product {

    @Id
    @Getter @Setter @Column(name = "productoId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter @Setter @Column(name = "nombre")
    private String nombre;

    @Getter @Setter @Column(name = "descripcion")
    private String descripcion;

    @Getter @Setter @Column(name = "imagenUrl")
    private String imagen;

    @ManyToMany (mappedBy = "Producto")
    private List<User> Usuario;

    @ManyToOne
    @JoinColumn(name = "Producto")
    private List<Category> Categoria;

}