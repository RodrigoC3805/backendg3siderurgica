package dsw.backendg3siderurgica.repository;

import dsw.backendg3siderurgica.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario
    
}
