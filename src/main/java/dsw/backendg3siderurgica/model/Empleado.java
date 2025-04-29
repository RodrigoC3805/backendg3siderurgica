package dsw.backendg3siderurgica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "usuario")
public class Empleado {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idusuario")
    private Integer idEmpleado;
    private String email;
    private String password;
    private String nombre;
    private Integer telefono;
    private String direccion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idtipousuario", referencedColumnName = "idtipousuario")
    private TipoEmpleado tipoEmpleado; // Relación con TipoEmpleado
}
