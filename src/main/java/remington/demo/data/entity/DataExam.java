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
public class DataExam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDataExam;  // ID autogenerado para la entidad

    @Enumerated(EnumType.STRING)
    private ExamType type; // Tipo de examen médico

    private String date;  // Fecha del examen
    private String city;  // Ciudad donde se realiza
}