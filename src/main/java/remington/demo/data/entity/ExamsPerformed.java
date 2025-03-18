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
public class ExamsPerformed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExamsPerformed;  // ID autogenerado para la entidad

    private boolean osteomuscular;
    private boolean spirometry;
    private boolean laboratories;
    private boolean audiometry;
    private boolean psychotechnics;
    private boolean visiometry;
    private boolean optometry;

    private String others; // Otros exámenes (descripción)
}
