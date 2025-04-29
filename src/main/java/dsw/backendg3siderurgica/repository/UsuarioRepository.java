package dsw.backendg3siderurgica.repository;

import dsw.backendg3siderurgica.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario
    
}
