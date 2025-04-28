package dsw.backendg3siderurgica.dto;

import java.util.List;
import java.util.stream.Collectors;

import dsw.backendg3siderurgica.model.Empleado; // Make sure to import the Empleado model
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoResponse {
    private Integer idEmpleado; // Assuming you have an ID for the employee
    private String nombres;
    private String apellidos;
    private String tipoDeDocumento;
    private int numeroDeDocumento;
    private String fechaDeNacimiento; // Consider using String for formatting or a Date object
    private int telefono;
    private double montoDeSueldo;
    private String tipoDeMoneda;
    private boolean estadoDelContrato;

    public static EmpleadoResponse fromEntity(Empleado empleado) {
        return EmpleadoResponse.builder()
                .idEmpleado(empleado.getIdEmpleado()) // Assuming there's an ID field in Empleado
                .nombres(empleado.getNombres())
                .apellidos(empleado.getApellidos())
                .tipoDeDocumento(empleado.getTipoDeDocumento())
                .numeroDeDocumento(empleado.getNumeroDeDocumento())
                .fechaDeNacimiento(empleado.getFechaDeNacimiento().toString()) // Convert Date to String if needed
                .telefono(empleado.getTelefono())
                .montoDeSueldo(empleado.getMontoDeSueldo())
                .tipoDeMoneda(empleado.getTipoDeMoneda())
                .estadoDelContrato(empleado.isEstadoDelContrato())
                .build();
    }

    public static List<EmpleadoResponse> fromEntities(List<Empleado> empleados) {
        return empleados.stream()
            .map(EmpleadoResponse::fromEntity)
            .collect(Collectors.toList());
    }
}