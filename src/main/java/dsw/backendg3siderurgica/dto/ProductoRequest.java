package dsw.backendg3siderurgica.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductoRequest {
    private Integer idProducto;
    private String nombre;
    private Long stock;
    private Double precio;
    private String unidades;
}
