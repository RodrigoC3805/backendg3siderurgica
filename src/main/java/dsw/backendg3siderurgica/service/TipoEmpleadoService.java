package dsw.backendg3siderurgica.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dsw.backendg3siderurgica.repository.TipoEmpleadoRepository;
import dsw.backendg3siderurgica.model.TipoEmpleado;

@Service
public class TipoEmpleadoService {
    @Autowired
    TipoEmpleadoRepository tipoEmpleadoRepository;

    public List<TipoEmpleado> getTipoEmpleado(){
        return tipoEmpleadoRepository.findAll();
    }
}
