package mision.agro.mision_agro.service;
  
import java.util.List;

import mision.agro.mision_agro.model.entity.Usuario;


public interface  UsuarioServicio {
    
    public List<Usuario> listaUsuarios();
    
    /* Vamos a crear los métodos*/
    public void guardar(Usuario usuario);
    
    public void borrar(Usuario usuario);
    
    public Usuario localizarIndividuo(Usuario usuario);
    
}

    

