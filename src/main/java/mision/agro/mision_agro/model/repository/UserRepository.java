package mision.agro.mision_agro.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import mision.agro.mision_agro.model.Entity.User;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByEmailUsuarioAndPasswordUsuario(String email, String password);

    Optional<User> findByEmailUsuario(String email);

    //Evaluar nombre de atributos en llamado... eliminar palabra Usuario en caso de que no corra correctamente
    
}
