package dsw.backendg3siderurgica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dsw.backendg3siderurgica.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario

    
} 
