package mision.agro.mision_agro.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import mision.agro.mision_agro.model.entity.Entity;




@Entity
@Table(name="usuario", uniqueConstraints = @UniqueConstraint(columnNames="Correo"))

public class UsuarioRegistro {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;
    @Column(name="Nombre_completo")
    private String Nombre_completo;
    @Column(name="Apellido")
    private String Apellido;
    @Column(name="Correo")
    private String Correo;
    @Column(name="Telefono")
    private String Telefono;
    @Column(name="Contrasena")
    private String Contrasena;



    

        

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

    /**
     * @return String return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return String return the Correo
     */
    public String getCorreo() {
        return Correo;
    }

    /**
     * @param Correo the Correo to set
     */
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    /**
     * @return String return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    /**
     * @return String return the Contrasena
     */
    public String getContrasena() {
        return Contrasena;
    }

    /**
     * @param Contrasena the Contrasena to set
     */
    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public UsuarioRegistro(Long id, String Nombre_completo, String Apellido,String Correo,String Telefono, String Contrasena){

        super();
        this.id= id;
        this.Nombre_completo = Nombre_completo;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Contrasena = Contrasena;

    }

    public UsuarioRegistro( String Nombre_completo, String Apellido,String Correo, String Telefono, String Contrasena){

        super();
        this.Nombre_completo = Nombre_completo;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Contrasena = Contrasena;

    }

    public UsuarioRegistro(){

        super();
       

    }
}
