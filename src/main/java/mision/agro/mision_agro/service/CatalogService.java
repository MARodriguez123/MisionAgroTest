package mision.agro.mision_agro.service;

import java.util.List;
import java.util.Optional;

import mision.agro.mision_agro.Controller.dto.CategoryDto;
import mision.agro.mision_agro.Controller.dto.ProductDto;

public interface CatalogService {
    List<CategoryDto> getCategories();

    Optional<CategoryDto> getCategoryById(Integer id);

    List<ProductDto> getProductoByCategoryId(Integer categoryId);

    ProductDto getProductoById(String id);

}