package remington.demo.service;

import org.springframework.stereotype.Service;
import remington.demo.data.entity.*;
import remington.demo.data.repository.PatientRepository;
import remington.demo.exception.ResourceNotFoundException;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found with ID: " + id));
    }

    @Override
    public Patient createPatient(Patient patient) {
        if (patient.getMedicalExams() != null) {
            for (MedicalExam exam : patient.getMedicalExams()) {
                exam.setPatient(patient); // Vincular cada examen al paciente

                // Asegurar que los exámenes tengan datos completos antes de guardar
                if (exam.getDataExam() == null) {
                    exam.setDataExam(new DataExam()); // Evita null
                }
                if (exam.getOccupationalData() == null) {
                    exam.setOccupationalData(new OccupationalData());
                }
                if (exam.getExamsPerformed() == null) {
                    exam.setExamsPerformed(new ExamsPerformed());
                }
                if (exam.getWorkAptitude() == null) {
                    exam.setWorkAptitude(new WorkAptitude());
                }
                if (exam.getGeneralRecommendation() == null) {
                    exam.setGeneralRecommendation(new GeneralRecommendation());
                }
            }
        }

        return patientRepository.save(patient);
    }



    @Override
    public Patient updatePatient(Long id, Patient patientDetails) {
        Patient existingPatient = patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found with ID: " + id));

        existingPatient.setPersonalData(patientDetails.getPersonalData());
        existingPatient.setHabits(patientDetails.getHabits());
        existingPatient.setPersonalHistory(patientDetails.getPersonalHistory());
        existingPatient.setFamilyHistory(patientDetails.getFamilyHistory());
        existingPatient.setGynecoObstetricHistory(patientDetails.getGynecoObstetricHistory());
        existingPatient.setWorkHistory(patientDetails.getWorkHistory());
        existingPatient.setEvaluation(patientDetails.getEvaluation());

        if (patientDetails.getMedicalExams() != null) {
            for (MedicalExam exam : patientDetails.getMedicalExams()) {
                exam.setPatient(existingPatient); // Asegurar la relación
            }
            existingPatient.setMedicalExams(patientDetails.getMedicalExams());
        }

        return patientRepository.save(existingPatient);
    }


    @Override
    public void deletePatient(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found with ID: " + id));
        patientRepository.delete(patient);
    }

}
