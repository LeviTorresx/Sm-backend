package remington.demo.data.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PersonalHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonalHistory;

    private String pathological;
    private String hospitalizations;
    private String surgeries;
    private String trauma;
    private String medications;
    private String toxicExposures;
    private String allergies;
    private String other;

    public Long getIdPersonalHistory() {
        return idPersonalHistory;
    }

    public void setIdPersonalHistory(Long idPersonalHistory) {
        this.idPersonalHistory = idPersonalHistory;
    }

    public String getPathological() {
        return pathological;
    }

    public void setPathological(String pathological) {
        this.pathological = pathological;
    }

    public String getHospitalizations() {
        return hospitalizations;
    }

    public void setHospitalizations(String hospitalizations) {
        this.hospitalizations = hospitalizations;
    }

    public String getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(String surgeries) {
        this.surgeries = surgeries;
    }

    public String getTrauma() {
        return trauma;
    }

    public void setTrauma(String trauma) {
        this.trauma = trauma;
    }

    public String getMedications() {
        return medications;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }

    public String getToxicExposures() {
        return toxicExposures;
    }

    public void setToxicExposures(String toxicExposures) {
        this.toxicExposures = toxicExposures;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
