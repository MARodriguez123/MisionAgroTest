package mision.agro.mision_agro.model.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="usuario")
public class Usuario implements Serializable {
//Data lo que hace es crearme los setters y getters de los atributos
    private static final long serialVersionUID= 1L;
        //Todo= Declaramos nuestros atributos
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id_registro;
    private String Usuario;
    private String Nombre_Completo;
    private String  Apellido;  
    private String Correo;
    private String Telefono;
    private String Contrasena;

    
}
