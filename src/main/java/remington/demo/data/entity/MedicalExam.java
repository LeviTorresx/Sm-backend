package remington.demo.data.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class MedicalExam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedicalExam; // ID autogenerado para la entidad

    @ManyToOne
    @JoinColumn(name = "patient_id")
    @JsonBackReference
    private Patient patient;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private DataExam dataExam;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private OccupationalData occupationalData;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private ExamsPerformed examsPerformed;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private WorkAptitude workAptitude;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private GeneralRecommendation generalRecommendation;


    public Long getIdMedicalExam() {
        return idMedicalExam;
    }

    public void setIdMedicalExam(Long idMedicalExam) {
        this.idMedicalExam = idMedicalExam;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public DataExam getDataExam() {
        return dataExam;
    }

    public void setDataExam(DataExam dataExam) {
        this.dataExam = dataExam;
    }

    public OccupationalData getOccupationalData() {
        return occupationalData;
    }

    public void setOccupationalData(OccupationalData occupationalData) {
        this.occupationalData = occupationalData;
    }

    public ExamsPerformed getExamsPerformed() {
        return examsPerformed;
    }

    public void setExamsPerformed(ExamsPerformed examsPerformed) {
        this.examsPerformed = examsPerformed;
    }

    public WorkAptitude getWorkAptitude() {
        return workAptitude;
    }

    public void setWorkAptitude(WorkAptitude workAptitude) {
        this.workAptitude = workAptitude;
    }

    public GeneralRecommendation getGeneralRecommendation() {
        return generalRecommendation;
    }

    public void setGeneralRecommendation(GeneralRecommendation generalRecommendation) {
        this.generalRecommendation = generalRecommendation;
    }
}
