package mision.agro.mision_agro.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mision.agro.mision_agro.model.Entity.login;

public interface loginRepository extends JpaRepository<login, String> {
    
}
