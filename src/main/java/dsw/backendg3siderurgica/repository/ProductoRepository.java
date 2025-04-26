package dsw.backendg3siderurgica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dsw.backendg3siderurgica.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
