package dsw.backendg3siderurgica.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dsw.backendg3siderurgica.dto.UsuarioResponse;
import dsw.backendg3siderurgica.repository.UsuarioRepository;
import dsw.backendg3siderurgica.repository.TipoUsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    TipoUsuarioRepository tipoUsuarioRepository;

    public List<UsuarioResponse> listUsuarios() {
        return UsuarioResponse.fromEntities(usuarioRepository.findAll());
    }
}
