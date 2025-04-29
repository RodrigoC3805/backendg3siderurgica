package dsw.backendg3siderurgica.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dsw.backendg3siderurgica.dto.EmpleadoResponse;
import dsw.backendg3siderurgica.repository.EmpleadoRepository;
import dsw.backendg3siderurgica.repository.TipoEmpleadoRepository;

@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;
    @Autowired
    TipoEmpleadoRepository tipoEmpleadoRepository;

    public List<EmpleadoResponse> listEmpleados() {
        return EmpleadoResponse.fromEntities(empleadoRepository.findAll());
    }
}
