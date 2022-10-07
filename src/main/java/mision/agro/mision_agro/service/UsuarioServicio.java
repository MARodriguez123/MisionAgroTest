package mision.agro.mision_agro.service;
  
import java.util.List;

import mision.agro.mision_agro.Controller.dto.UsuarioRegistroDto;
import mision.agro.mision_agro.model.UsuarioRegistro;
import mision.agro.mision_agro.model.entity.Usuario;


public interface  UsuarioServicio {
    
    public List<Usuario> listaUsuarios();
    
    public UsuarioRegistro guardar(UsuarioRegistroDto registroDto );
    
    /* Vamos a crear los métodos*/
    public void guardar(Usuario usuario);
    
    public void borrar(Usuario usuario);
    
    public Usuario localizarUsuario(Usuario usuario);
    
}

    

