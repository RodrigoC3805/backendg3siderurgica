package dsw.backendg3siderurgica.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dsw.backendg3siderurgica.dto.ClienteResponse;
import dsw.backendg3siderurgica.service.ClienteService;
import dsw.backendg3siderurgica.utils.ErrorResponse;

@RestController
@RequestMapping(path="api/v1/cliente")
public class ClienteController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    ClienteService clienteService;

    @GetMapping
    public ResponseEntity<?> getClientes() {
        List<ClienteResponse> listaClienteResponse = null;
        try {
            listaClienteResponse = clienteService.listClientes();
        } catch (Exception e) {
            logger.error("Error inesperado", e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if (listaClienteResponse.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(ErrorResponse.builder().message("Cliente not found"));
        return ResponseEntity.ok(listaClienteResponse);
    }
}
