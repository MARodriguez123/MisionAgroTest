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
@Table(name = "login")
public class login {

    @Id
    @Getter @Setter @Column(name = "login_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "email_usuario") 
    private user email_usuario;

    @OneToOne
    @JoinColumn(name = "password_usuario") 
    private user password_usuario;
    

}
