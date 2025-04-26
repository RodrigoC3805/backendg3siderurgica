package dsw.backendg3siderurgica.dto;

import java.util.List;
import java.util.stream.Collectors;

import dsw.backendg3siderurgica.model.Producto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductoResponse {
    private Integer idProducto;
    private String nombre;
    private Long stock;
    private Double precio;
    private String unidades;

    public static ProductoResponse fromEntity(Producto producto) {
        return ProductoResponse.builder()
                .idProducto(producto.getIdProducto())
                .nombre(producto.getNombre())
                .precio(producto.getPrecio())
                .stock(producto.getStock())
                .unidades(producto.getUnidades())
                .build();
    }

    public static List<ProductoResponse> fromEntities(List<Producto> producto) {
        return producto.stream()
            .map(ProductoResponse::fromEntity)
                .collect(Collectors.toList());
    }
}
