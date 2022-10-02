package mision.agro.mision_agro.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import mision.agro.mision_agro.model.Entity.product;

public interface productRepository extends JpaRepository<product, String> {

    Optional<product> findByNombre(String string);

    List<product> findAllByCategoriaId(Long categoriaId);

    List<product> findAllByDescripcionLikeOrderByNombreAsc(String descripcion);
}