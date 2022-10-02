package mision.agro.mision_agro.model.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
public class user {
    @Id
    @Getter @Setter @Column(name = "usuario_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter @Column(name = "nombre")
    private String nombre;

    @Getter @Setter @Column(name = "apellido")
    private String apellido;
    
    @Getter @Setter @Column(name = "email_usuario", unique = true)
    private String email;

    @Getter @Setter @Column(name = "password_usuario")
    private String password;

    @Getter @Setter @Column(name = "telefono")
    private String telefono;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<product> producto;

}