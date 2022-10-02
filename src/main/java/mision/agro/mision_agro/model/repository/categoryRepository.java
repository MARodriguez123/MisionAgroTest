package mision.agro.mision_agro.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import mision.agro.mision_agro.model.Entity.category;

public interface categoryRepository extends JpaRepository<category, Long> {

    Optional<category> findByNombre(String string);


    
}
