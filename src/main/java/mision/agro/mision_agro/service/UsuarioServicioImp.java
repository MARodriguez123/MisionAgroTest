package mision.agro.mision_agro.service;

import java.util.List;
import mision.agro.mision_agro.Controller.dto.UsuarioDto;
import mision.agro.mision_agro.Controller.dto.UsuarioRegistroDto;
import mision.agro.mision_agro.model.UsuarioRegistro;
import mision.agro.mision_agro.model.entity.Usuario;
import mision.agro.mision_agro.repository.UsuarioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class UsuarioServicioImp implements UsuarioServicio {

@Autowired

private UsuarioRepositorio  usuarioRepositorio;

public UsuarioServicioImp(UsuarioRepositorio usuarioRepositorio){
    super();
    this.usuarioRepositorio=usuarioRepositorio;
}
@Override
public UsuarioRegistro guardar(UsuarioRegistroDto  registroDto){
    UsuarioRegistro usuarioRegistro = new UsuarioRegistro(registroDto.getNombre_completo(),
    registroDto.getApellido() ,registroDto.getCorreo() ,registroDto.getTelefono( ) ,registroDto.getContrasena());
   return usuarioRepositorio.save(usuarioRegistro);
}

//Parte para el manejo del crud


private UsuarioDto usuarioDto;
    

    @Override
     //Se agrega la entidad transaccional para evitar una serie de errores al momento de las consultas
    @Transactional(readOnly= true)

    public List<Usuario> listaUsuarios() {
        //Para recupeerar los datos de tipo persona se hace lo siguiente
        
        return (List<Usuario>) usuarioDto.findAll();
    }

    @Override
    @Transactional
    public void guardar(Usuario usuario) {

     //Para que me guarde la información en la base de datos

     usuarioDto.save(usuario);

    }

    /* (non-Javadoc)
     * @see mision.agro.mision_agro.service.IndividuoServicio#borrar(mision.agro.mision_agro.service.Individuo)
     */
    @Override
    @Transactional
    public void borrar(Usuario usuario) {


        // TODO= Para borrar información que se desea

        usuarioDto.delete(usuario);
    }

    @Override
    @Transactional(readOnly=true)
    public Usuario localizarUsuario(Usuario usuario) {
        // TODO Para localizar a un individuo por medio del id

        return usuarioDto.findById(usuario.getId_registro()).orElse(null);
    }

  
    
}
