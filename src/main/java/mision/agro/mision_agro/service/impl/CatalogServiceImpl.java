package mision.agro.mision_agro.service.impl;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import mision.agro.mision_agro.controller.dto.CategoryDto;
import mision.agro.mision_agro.controller.dto.ProductDto;
import mision.agro.mision_agro.model.Repository.CategoryRepository;
import mision.agro.mision_agro.model.Repository.ProductRepository;
import mision.agro.mision_agro.model.Repository.UserRepository;
import mision.agro.mision_agro.service.CatalogService;

@AllArgsConstructor
@Service


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
        var category = productRepository.findById(id.longValue());

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
    
            var categoryProducts= products.stream()
            .map(pro-> ProductDto.builder()
                    .id(pro.getCode())
                    .nombre(pro.getNombre())
                    .descripcion(pro.getDescription())
                    .userId(pro.getUserId)
                    .imagenUrl(pro.getImagenUrl)
                    .build())
                .collect(Collectors.toList());
              
        
            return categoryProducts;
        }

    @Override
    public ProductDto getProductsById(String id) {
        var productOp =productRepository.findById(id);

        var product = productOp.get();
        return ProductDto.builder()
                 .id(product.getCode())
                 .nombre(product.getNombre())
                 .descripcion(product.getDescripcion())
                 .userId(product.getUserId())
                 .imagenUrl(product..getImagenUrl())
                 .build();

    }

    @Override
    public List<ProductDto> getMoviesByFilter(FilterDto filter) {
        var tipos= filter.getTipo() != null;
        var variedad = filter.getVariedad() != null;

        if(tipos && variedad) {
            // movieRepository.findAllByTypeIdInAndSchoolIdIn(filter.getType(), filter.getSchool());
            // SELECT * FROM movie WHERE type in ('d') and school in ('1', '2');
        }
        return null;
    }

}