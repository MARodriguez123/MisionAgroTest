package mision.agro.mision_agro.model.entity;

import java.io.Serializable;

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
    private String usuario;
    private String nombre;
    private String  apellido;  
    private String correo;
    private String telefono;
    private String contraseña;

    
}
