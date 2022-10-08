package mision.agro.mision_agro.service.impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.var;
import mision.agro.mision_agro.model.Repository.UserRepository;
import mision.agro.mision_agro.service.SecurityService;

@Service
@AllArgsConstructor
public class SecurityServiceImpl implements SecurityService{

    private final UserRepository userRepository;

    @Override
    public void ValidateUser(String usuario_id, String password_usuario) {
        
        var userOp = userRepository.findByEmail(password_usuario);

        if(userOp.isPresent())
        {

        }
    }
    
}
