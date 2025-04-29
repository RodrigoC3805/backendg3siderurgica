package dsw.backendg3siderurgica.dto;

import java.util.List;
import java.util.stream.Collectors;

import dsw.backendg3siderurgica.model.Cliente;
import dsw.backendg3siderurgica.model.TipoCliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteResponse {
    private Integer idCliente;
    private String nombre;
    private String ruc;
    private TipoCliente tipoCliente; 

    public static ClienteResponse fromEntity(Cliente cliente) {
        return ClienteResponse.builder()
                .idCliente(cliente.getIdCliente())
                .nombre(cliente.getNombre())
                .ruc(cliente.getRuc())
                .tipoCliente(cliente.getTipoCliente())
                .build();
    }

    public static List<ClienteResponse> fromEntities(List<Cliente> cliente) {
        return cliente.stream()
            .map(ClienteResponse::fromEntity)
                .collect(Collectors.toList());
    }
}
