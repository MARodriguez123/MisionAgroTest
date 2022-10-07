package mision.agro.mision_agro.Controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer categoryId;
    private Integer userId;
    private String imagenUrl;
}
