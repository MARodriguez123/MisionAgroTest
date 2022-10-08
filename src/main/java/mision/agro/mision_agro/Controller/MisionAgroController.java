package mision.agro.mision_agro.Controller;

import org.springframework.asm.Attribute;
import org.springframework.asm.Attribute;
import org.springframework.asm.Attribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MisionAgroController {
    //El  model es un objetos para trabajar con MVC y me representa a los datos que me muestra en la vista y me trabaja con todos los métodos..
    @GetMapping("/frutas")
    public String goTofrutas(Model model) {
        return "frutas";    
    }

    @GetMapping("/granos")
    public String goTogranos(Model model) {
        return "granos";    
    }

    @GetMapping("/lacteos")
    public String goTolacteos(Model model) {
        return "lacteos";    
    }

    @GetMapping("/verduras")
    public String goToverduras(Model model) {
        return "verduras";    
    }

    @GetMapping("/proteinas")
    public String goToproteinas(Model model) {
        return "proteinas";    
    }

    @GetMapping("/otros")
    public String goTootros(Model model) {
        return "otros";    
    }

    @GetMapping("/login")
    public String goTologin(Model model) {
        return "login";    
    }

    @GetMapping("/registro")
    public String goToregistro(Model model) {
        return "registro";    
    }

    @GetMapping("/politica-privacidad")
    public String goTopoliticaprivacidad(Model model) {
        return "politica-privacidad";    
    }

    @GetMapping("/terminos-condiciones")
    public String goToterminoscondiciones(Model model) {
        return "terminos-condiciones";    
    }

    @GetMapping("/trata-datos")
    public String goTotratadatos(Model model) {
        return "trata-datos";    
    }

    @GetMapping("/publicaciones")
    public String goTopublicaciones(Model model) {
        return "publicaciones";    
    }

    @GetMapping("/listausuarios")
    public String goTolistausuarios(Model model) {
        model.addAttribute("name", Attribute:"Bienvenido Señor Admin");
        return "/listausuarios";  
}
}