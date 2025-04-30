package dsw.backendg3siderurgica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dsw.backendg3siderurgica.dto.ClienteRequest;
import dsw.backendg3siderurgica.dto.ClienteResponse;
import dsw.backendg3siderurgica.model.Cliente;
import dsw.backendg3siderurgica.model.TipoCliente;
import dsw.backendg3siderurgica.repository.ClienteRepository;
import dsw.backendg3siderurgica.repository.TipoClienteRepository;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    TipoClienteRepository tipoClienteRepository;

    public List<ClienteResponse> listClientes() {
        return ClienteResponse.fromEntities(clienteRepository.findAll());
    }

    public ClienteResponse insertCliente(ClienteRequest clienteRequest){
        Integer idTipoCliente = clienteRequest.getIdTipoCliente();
        TipoCliente tipoCliente = tipoClienteRepository.findById(idTipoCliente).get();
        if(tipoCliente == null) return new ClienteResponse();

        Cliente cliente = new Cliente(
            clienteRequest.getIdCliente(),
            clienteRequest.getNombre(),
            clienteRequest.getRuc(),
            tipoCliente
        );

        cliente = clienteRepository.save(cliente);
        return ClienteResponse.fromEntity(cliente);
    }
}
