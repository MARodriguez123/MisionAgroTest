package mision.agro.mision_agro.service;

import java.util.List;

import mision.agro.mision_agro.controller.dto.UserRequest;
import mision.agro.mision_agro.controller.dto.UserResponse;

public interface SecurityService {
    UserResponse validateUser(String username, String password);

    List<UserResponse> getAllUsers();

    void createUser(UserRequest user);

    void updateUser(UserRequest user);

    void deleteUser(String username);

    void activateUser(String username);

    void inactivateUser(String username);
}
