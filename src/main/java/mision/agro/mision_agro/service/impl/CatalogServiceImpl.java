package mision.agro.mision_agro.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Sort;

import mision.agro.mision_agro.controller.dto.CategoryDto;
import mision.agro.mision_agro.controller.dto.ProductDto;
import mision.agro.mision_agro.model.Repository.CategoryRepository;
import mision.agro.mision_agro.model.Repository.ProductRepository;
import mision.agro.mision_agro.model.Repository.UserRepository;
import mision.agro.mision_agro.service.CatalogService;

public class CatalogServiceImpl implements CatalogService {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    @Override
    public List<CategoryDto> getCategories() {
        var categories = categoryRepository.findAll(Sort.by("name"));

        return categories.stream()
                .map(cat -> new CategoryDto(cat.getNombre(), cat.getId().intValue()))
                .collect(Collectors.toList());

    }

    @Override
    public Optional<CategoryDto> getCategoryById(Integer id) {
        var category = productRepository.deleteAllById(id.longValue());
        if (category.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(new CategoryDto(
                category.get().getNombre(),
                category.get().getId().intValue()));

    }

    @Override
        public List<ProductDto> getProductsByCategoryId(Integer categoryId) {
            var products = productRepository.findAllByCategoryId(categoryId.longValue());
    
            var categoryProducts= product.stream()
            .map(pro-> ProductDto.builder()
                    .id(pro.getCode())
                    .nombre(pro.getNombre())
                    ,
    
    
    
            );
            
            return categoryProducts;
        }

    @Override
    public ProductDto getProductsById(String id) {

        return null;
    }

    @Override
    public List<ProductImageDto> getProductsImageById(String id) {

        return null;
    }

}}
