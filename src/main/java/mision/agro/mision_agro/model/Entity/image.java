package mision.agro.mision_agro.model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "imagenes")
public class image {

    @Id
    @Getter @Setter @Column(name = "image_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter @Setter @Column(name = "nombre", unique = true)
    private String nombre;
    
    @Getter @Setter @Column(name = "imagenURL", unique = true)
    private String imageURL;

    @OneToOne
    @JoinColumn(name = "producto_id") 
    private product producto;
}
