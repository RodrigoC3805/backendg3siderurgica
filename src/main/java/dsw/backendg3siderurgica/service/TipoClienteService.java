package dsw.backendg3siderurgica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dsw.backendg3siderurgica.model.TipoCliente;
import dsw.backendg3siderurgica.repository.TipoClienteRepository;

@Service
public class TipoClienteService {
    @Autowired
    TipoClienteRepository tipoClienteRepository;

    public List<TipoCliente> getTipoCliente(){
        return tipoClienteRepository.findAll();
    }
}
