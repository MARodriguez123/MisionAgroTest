package mision.agro.mision_agro.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import mision.agro.mision_agro.model.Entity.user;

public interface userRepository extends JpaRepository<user, String> {

    Optional<user> findByNombre(String nombre);

    Optional<user> findByApellido(String apellido);

    Optional<user> findByEmail(String email_usuario);
    
}
