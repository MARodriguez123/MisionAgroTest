package mision.agro.mision_agro.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import mision.agro.mision_agro.Controller.dto.UsuarioRegistroDto;
import mision.agro.mision_agro.service.UsuarioServicio;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping("/registro")

public class UsuarioRegistroRest {

    private UsuarioServicio usuarioServicio;

    public UsuarioRegistroRest(UsuarioServicio usuarioServicio){
        super();
        this.usuarioServicio = usuarioServicio;

    }
    @ModelAttribute("usuario")
    public UsuarioRegistroDto retorneNuevoUsuarioRegistroDto(){
        return new UsuarioRegistroDto();
    }

    @GetMapping
    public String mostrarFormularioDeRegistro(){
        return "registro";
    }

    @PostMapping()

    public String  registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDto registroDto){

        usuarioServicio.guardar(registroDto);
        return "redirect:/registro?exito";


    }
 
    
    
}
