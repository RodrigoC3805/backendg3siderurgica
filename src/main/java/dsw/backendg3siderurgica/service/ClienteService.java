package dsw.backendg3siderurgica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dsw.backendg3siderurgica.dto.ClienteResponse;
import dsw.backendg3siderurgica.repository.ClienteRepository;
import dsw.backendg3siderurgica.repository.TipoClienteRepository;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository empleadoRepository;
    @Autowired
    TipoClienteRepository tipoClienteRepository;

    public List<ClienteResponse> listClientes() {
        return ClienteResponse.fromEntities(empleadoRepository.findAll());
    }
}
