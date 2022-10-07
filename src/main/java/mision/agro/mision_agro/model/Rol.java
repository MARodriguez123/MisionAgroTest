package mision.agro.mision_agro.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import mision.agro.mision_agro.model.entity.Entity;

@Entity
@Table( name="rol")
public class Rol {

    @Id
   
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;
    private String Nombre_completo;
    

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the Nombre_completo
     */
    public String getNombre_completo() {
        return Nombre_completo;
    }

    /**
     * @param Nombre_completo the Nombre_completo to set
     */
    public void setNombre_completo(String Nombre_completo) {
        this.Nombre_completo = Nombre_completo;
    }
public Rol(Long id, String Nombre_completo){
    super();
    this.id= id;
    this.Nombre_completo = Nombre_completo;

}

public Rol(){
    super();
}
}
