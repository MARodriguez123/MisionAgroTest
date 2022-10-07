package mision.agro.mision_agro.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;
import mision.agro.mision_agro.model.entity.Usuario;
import mision.agro.mision_agro.service.UsuarioServicio;




@Controller
@Slf4j

public class ControladorRest {


    @Autowired
    //Vamos a inyectar datos de la capa de servicio
    
    private UsuarioServicio  usuarioServicio;
   
    @GetMapping("/")
    public String comienzo(Model model){
        
        List<Usuario> usuarios = usuarioServicio.listaUsuarios();
    
       
       // Otra forma de agragar una lista de individuos 
        
      
       
     
        model.addAttribute("usuarios",usuarios);
        return "listausuarios";
    }
    
    //Vamos a crear otro mapeo y un nuevo html para hacer los cambios
    
    @GetMapping("/anexar")
    
    public String anexar (Usuario usuario){
        
        return "cambiar";
    }
    
    //Vamos a hacer mapeo con la entidad post
    @PostMapping("/guardar")
    //Creamos el método
    public String guardar(Usuario usuario){
        
        usuarioServicio.guardar(usuario);
        
        //Una vez haya hecho el determinado guardado que me redireccione a la página de inicio   
        //@GetMapping("/")
        
        return "redirect:/";
        
        
    }
    
    @GetMapping("/cambiar/{Id_registro}")
    public String cambiar(Usuario usuario, Model model){
        usuario =  usuario =usuarioServicio.localizarUsuario(usuario);
        model.addAttribute("usuario", usuario);
        
        return "./cambiar";
    }
    
}
