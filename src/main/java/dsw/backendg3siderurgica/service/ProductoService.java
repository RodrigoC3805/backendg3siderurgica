package dsw.backendg3siderurgica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dsw.backendg3siderurgica.dto.ProductoRequest;
import dsw.backendg3siderurgica.dto.ProductoResponse;
import dsw.backendg3siderurgica.model.Producto;
import dsw.backendg3siderurgica.repository.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;
    
    public List<ProductoResponse> listProductos() {
        return ProductoResponse.fromEntities(productoRepository.findAll());
    }
    
    public ProductoResponse insertProducto(ProductoRequest productoRequest) {
        Producto producto=new Producto(
            productoRequest.getIdProducto(),
            productoRequest.getNombre(),
            productoRequest.getStock(),
            productoRequest.getPrecio(),
            productoRequest.getUnidades()
        );
        producto = productoRepository.save(producto);
        return ProductoResponse.fromEntity(producto);
    }
}
