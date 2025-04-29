package dsw.backendg3siderurgica.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequest {
    private Integer idCliente;
    private Integer idTipoCliente;
    private String nombre;
    private String ruc;
}
