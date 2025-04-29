package dsw.backendg3siderurgica.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dsw.backendg3siderurgica.repository.TipoUsuarioRepository;
import dsw.backendg3siderurgica.model.TipoUsuario;

@Service
public class TipoUsuarioService {
    @Autowired
    TipoUsuarioRepository tipoUsuarioRepository;

    public List<TipoUsuario> getTipoUsuarios(){
        return tipoUsuarioRepository.findAll();
    }
}
