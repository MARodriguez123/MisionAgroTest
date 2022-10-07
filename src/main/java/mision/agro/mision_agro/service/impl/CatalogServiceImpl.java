package mision.agro.mision_agro.service.impl;

import java.util.List;
import java.util.Optional;

import mision.agro.mision_agro.controller.dto.CategoryDto;
import mision.agro.mision_agro.controller.dto.ProductDto;
import mision.agro.mision_agro.controller.dto.ProductImageDto;
import mision.agro.mision_agro.service.CatalogService;

public class CatalogServiceImpl implements CatalogService{

    @Override
    public List<CategoryDto> getCategories() {
        
        
        
        return null;
    }

    @Override
    public Optional<CategoryDto> getCategoryById(Integer id) {
        
        

        return Optional.empty();
    }

    @Override
    public List<ProductDto> getProductsByCategoryId(Integer categoryId) {
        
        

        return null;
    }

    @Override
    public ProductDto getProductsById(String id) {
        
        

        return null;
    }

    @Override
    public List<ProductImageDto> getProductsImageById(String id) {
        
        

        return null;
    }
    
}
