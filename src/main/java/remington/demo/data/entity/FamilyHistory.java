package remington.demo.data.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class FamilyHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFamilyHistory;

    private boolean metabolicDiseases;
    private boolean heartDisease;
    private boolean hypertensionFather;
    private boolean cancer;
    private String otherHistory;

    public Long getIdFamilyHistory() {
        return idFamilyHistory;
    }

    public void setIdFamilyHistory(Long idFamilyHistory) {
        this.idFamilyHistory = idFamilyHistory;
    }

    public boolean isMetabolicDiseases() {
        return metabolicDiseases;
    }

    public void setMetabolicDiseases(boolean metabolicDiseases) {
        this.metabolicDiseases = metabolicDiseases;
    }

    public boolean isHeartDisease() {
        return heartDisease;
    }

    public void setHeartDisease(boolean heartDisease) {
        this.heartDisease = heartDisease;
    }

    public boolean isHypertensionFather() {
        return hypertensionFather;
    }

    public void setHypertensionFather(boolean hypertensionFather) {
        this.hypertensionFather = hypertensionFather;
    }

    public boolean isCancer() {
        return cancer;
    }

    public void setCancer(boolean cancer) {
        this.cancer = cancer;
    }

    public String getOtherHistory() {
        return otherHistory;
    }

    public void setOtherHistory(String otherHistory) {
        this.otherHistory = otherHistory;
    }
}
