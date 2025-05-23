package dsw.backendg3siderurgica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tipocliente")
public class TipoCliente {
    @Id
    @Column(name="idtipocliente")
    private Integer idTipoCliente;
    private String descripcion;
}
