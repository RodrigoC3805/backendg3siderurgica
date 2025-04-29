package dsw.backendg3siderurgica.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequest {
    private Integer idUsuario;
    private Integer idTipoUsuario;
    private String email;
    private String password;
    private String nombre;
    private Integer telefono;
    private String direccion;

}