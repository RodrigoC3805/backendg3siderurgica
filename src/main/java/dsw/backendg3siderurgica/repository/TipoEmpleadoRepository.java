package dsw.backendg3siderurgica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dsw.backendg3siderurgica.model.TipoEmpleado;

@Repository
public interface TipoEmpleadoRepository extends JpaRepository<TipoEmpleado, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario
    
}
