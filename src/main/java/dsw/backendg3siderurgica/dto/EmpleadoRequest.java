package dsw.backendg3siderurgica.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoRequest {
    private String nombres;
    private String apellidos;
    private String tipoDeDocumento;
    private int numeroDeDocumento;
    private Date fechaDeNacimiento;
    private int telefono;
    private double montoDeSueldo;
    private String tipoDeMoneda;
    private boolean estadoDelContrato;

}