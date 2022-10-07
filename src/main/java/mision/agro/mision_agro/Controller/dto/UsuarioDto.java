package mision.agro.mision_agro.Controller.dto;



import org.springframework.data.repository.CrudRepository;

import mision.agro.mision_agro.model.entity.Usuario;


public interface UsuarioDto extends CrudRepository<Usuario, Long> {
    
}

    

