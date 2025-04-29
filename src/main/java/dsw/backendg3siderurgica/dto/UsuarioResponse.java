package dsw.backendg3siderurgica.dto;

import java.util.List;
import java.util.stream.Collectors;

import dsw.backendg3siderurgica.model.Usuario; // Make sure to import the Usuario model
import dsw.backendg3siderurgica.model.TipoUsuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioResponse {
    private Integer idusuario;
    private String email;
    private String password;
    private String nombre;
    private Integer telefono;
    private String direccion;
    private TipoUsuario tipoUsuario;

    public static UsuarioResponse fromEntity(Usuario usuario) {
        return UsuarioResponse.builder()
                .idusuario(usuario.getIdusuario()) // Assuming there's an ID field in usuario
                .email(usuario.getEmail().toString())
                .password(usuario.getPassword().toString())
                .nombre(usuario.getNombre().toString())
                .telefono(usuario.getTelefono())
                .direccion(usuario.getDireccion().toString())
                .tipoUsuario(usuario.getTipoUsuario())
                .build();
    }

    public static List<UsuarioResponse> fromEntities(List<Usuario> usuario) {
        return usuario.stream()
            .map(UsuarioResponse::fromEntity)
            .collect(Collectors.toList());
    }
}