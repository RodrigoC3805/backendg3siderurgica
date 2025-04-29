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

import dsw.backendg3siderurgica.dto.EmpleadoResponse;
import dsw.backendg3siderurgica.service.EmpleadoService;
import dsw.backendg3siderurgica.utils.ErrorResponse;

@RestController
@RequestMapping(path="api/v1/usuario") 
public class EmpleadoController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    EmpleadoService empleadoService;

    @GetMapping
    public ResponseEntity<?> getEmpleados() {
        List<EmpleadoResponse> listaEmpleadoResponse = null;
        try {
            listaEmpleadoResponse = empleadoService.listEmpleados();
        } catch (Exception e) {
            logger.error("Error al obtener la lista de empleados", e);
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if(listaEmpleadoResponse.isEmpty()) 
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorResponse.builder().message("No se encontraron empleados").build());
            return ResponseEntity.ok(listaEmpleadoResponse);
    }
}
