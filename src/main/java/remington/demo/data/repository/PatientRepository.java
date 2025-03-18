package remington.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import remington.demo.data.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
