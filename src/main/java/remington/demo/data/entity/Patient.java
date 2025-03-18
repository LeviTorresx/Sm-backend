package remington.demo.data.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
    public class Patient {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idPatient;

        @OneToOne(cascade = CascadeType.ALL)
        private PersonalData personalData;

        @OneToOne(cascade = CascadeType.ALL)
        private Habits habits;

        @OneToOne(cascade = CascadeType.ALL)
        private PersonalHistory personalHistory;

        @OneToOne(cascade = CascadeType.ALL)
        private FamilyHistory familyHistory;

        @OneToOne(cascade = CascadeType.ALL)
        private GynecoObstetricHistory gynecoObstetricHistory;

        @OneToOne(cascade = CascadeType.ALL)
        private WorkHistory workHistory;

        @OneToOne(cascade = CascadeType.ALL)
        private Evaluation evaluation;

        @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
        @JsonManagedReference
        private List<MedicalExam> medicalExams; // Lista de exámenes médicos

    public List<MedicalExam> getMedicalExams() {
        return medicalExams;
    }


    public Long getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Long idPatient) {
        this.idPatient = idPatient;
    }

    public void setMedicalExams(List<MedicalExam> medicalExams) {
        this.medicalExams = medicalExams;
    }


    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public Habits getHabits() {
        return habits;
    }

    public void setHabits(Habits habits) {
        this.habits = habits;
    }

    public PersonalHistory getPersonalHistory() {
        return personalHistory;
    }

    public void setPersonalHistory(PersonalHistory personalHistory) {
        this.personalHistory = personalHistory;
    }

    public FamilyHistory getFamilyHistory() {
        return familyHistory;
    }

    public void setFamilyHistory(FamilyHistory familyHistory) {
        this.familyHistory = familyHistory;
    }

    public GynecoObstetricHistory getGynecoObstetricHistory() {
        return gynecoObstetricHistory;
    }

    public void setGynecoObstetricHistory(GynecoObstetricHistory gynecoObstetricHistory) {
        this.gynecoObstetricHistory = gynecoObstetricHistory;
    }

    public WorkHistory getWorkHistory() {
        return workHistory;
    }

    public void setWorkHistory(WorkHistory workHistory) {
        this.workHistory = workHistory;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }
}

