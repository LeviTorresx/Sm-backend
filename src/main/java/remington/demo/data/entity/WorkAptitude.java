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
public class WorkAptitude {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idWorkAptitude;  // ID autogenerado para la entidad

    private boolean entry;    // Aptitud para ingreso
    private boolean periodic; // Aptitud periódica
    private boolean exitStatus;     // Aptitud para retiro
}

