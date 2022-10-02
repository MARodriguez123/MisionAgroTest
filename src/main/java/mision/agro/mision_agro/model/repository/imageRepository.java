package mision.agro.mision_agro.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import mision.agro.mision_agro.model.Entity.image;

public interface imageRepository extends JpaRepository<image, String> {

    Optional<image> findByNombre(String string);
    
}
