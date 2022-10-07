package mision.agro.mision_agro.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mision.agro.mision_agro.model.UsuarioRegistro;

@Repository
public interface  UsuarioRepositorio extends JpaRepository <UsuarioRegistro, Long> {


    
}
