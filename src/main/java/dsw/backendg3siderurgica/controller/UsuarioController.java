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

import dsw.backendg3siderurgica.dto.UsuarioResponse;
import dsw.backendg3siderurgica.service.UsuarioService;
import dsw.backendg3siderurgica.utils.ErrorResponse;

@RestController
@RequestMapping(path="api/v1/usuario") 
public class UsuarioController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<?> getUsuarios() {
        List<UsuarioResponse> listaUsuarioResponse = null;
        try {
            listaUsuarioResponse = usuarioService.listUsuarios();
        } catch (Exception e) {
            logger.error("Error al obtener la lista de usuarios", e);
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if(listaUsuarioResponse.isEmpty()) 
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorResponse.builder().message("No se encontraron usuarios").build());
            return ResponseEntity.ok(listaUsuarioResponse);
    }
}
