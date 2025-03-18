package remington.demo.data.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OccupationalData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOccupationalData;  // ID autogenerado para la entidad

    private String employer;   // Nombre del empleador
    private boolean entry;     // Ingreso
    private boolean exitStatus;      // Retiro
    private boolean periodic;  // Examen periódico
    private String name;       // Nombre del empleado
    private String identification; // Identificación
    private String eps;        // EPS (seguridad social en salud)
    private String arl;        // ARL (seguridad en riesgos laborales)
    private String pensionFund; // Fondo de pensiones
    private String jobTitle;   // Cargo del empleado
}
