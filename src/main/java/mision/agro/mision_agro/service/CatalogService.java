package mision.agro.mision_agro.service;

import java.util.List;
import java.util.Optional;

import mision.agro.mision_agro.controller.dto.CategoryDto;
import mision.agro.mision_agro.controller.dto.ProductDto;

public interface CatalogService {
    List<CategoryDto> getCategories();

    Optional<CategoryDto> getCategoryById(Integer id);

    List<ProductDto> getProductoByCategoryId(Integer categoryId);

    ProductDto getProductoById(String id);

}