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
public class GeneralRecommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGeneralRecommendation;  // ID autogenerado para la entidad

    @Column(columnDefinition = "TEXT")
    private String generalRecommendations; // Recomendaciones generales

    @Column(columnDefinition = "TEXT")
    private String restrictions; // Restricciones
}
