package dsw.backendg3siderurgica.dto;

import java.util.List;
import java.util.stream.Collectors;

import dsw.backendg3siderurgica.model.Empleado; // Make sure to import the Empleado model
import dsw.backendg3siderurgica.model.TipoEmpleado;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoResponse {
    private Integer idEmpleado;
    private String email;
    private String password;
    private String nombre;
    private Integer telefono;
    private String direccion;
    private TipoEmpleado tipoEmpleado;

    public static EmpleadoResponse fromEntity(Empleado empleado) {
        return EmpleadoResponse.builder()
                .idEmpleado(empleado.getIdEmpleado()) // Assuming there's an ID field in Empleado
                .email(empleado.getEmail().toString())
                .password(empleado.getPassword().toString())
                .nombre(empleado.getNombre().toString())
                .telefono(empleado.getTelefono())
                .direccion(empleado.getDireccion().toString())
                .tipoEmpleado(empleado.getTipoEmpleado())
                .build();
    }

    public static List<EmpleadoResponse> fromEntities(List<Empleado> empleado) {
        return empleado.stream()
            .map(EmpleadoResponse::fromEntity)
            .collect(Collectors.toList());
    }
}