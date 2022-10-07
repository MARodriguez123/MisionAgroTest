package mision.agro.mision_agro.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

<<<<<<< HEAD
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import mision.agro.mision_agro.controller.dto.CategoryDto;
import mision.agro.mision_agro.controller.dto.ProductDto;
=======
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import mision.agro.mision_agro.Controller.dto.CategoryDto;
import mision.agro.mision_agro.Controller.dto.ProductDto;
>>>>>>> fdcdb041addb9f0baae2b67994a1b9dc801d9a12
import mision.agro.mision_agro.model.Repository.CategoryRepository;
import mision.agro.mision_agro.model.Repository.ProductRepository;
import mision.agro.mision_agro.model.Repository.UserRepository;
import mision.agro.mision_agro.service.CatalogService;

@AllArgsConstructor
@Service

public class CatalogServiceImpl implements CatalogService{

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;


    @Override
    public List<CategoryDto> getCategories() {
        var categories= categoryRepository.findAll(Sort.by("name"));

        return categories.stream()
        .map(cat -> new CategoryDto(cat.getNombre(), cat.getId().intValue()))
        .collect(Collectors.toList()); 
        
    }

    @Override
    public Optional<CategoryDto> getCategoryById(Integer id) {
        var category = productRepository.deleteAllById(id.longValue());
        if (category.isEmpty()){
            return Optional.empty();
        }
        
        return Optional.of(new CategoryDto(
        category.get().getNombre(),
        category.get().getId().intValue())
        );

       
    }

    @Override
    public List<ProductDto> getProductsByCategoryId(Integer categoryId) {
        var product = productRepository.findAllByCategoryId(categoryId.longValue());

        var categoryProducts= 
        

        
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
