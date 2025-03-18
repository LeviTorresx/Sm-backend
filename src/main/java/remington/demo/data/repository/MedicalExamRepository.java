package remington.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import remington.demo.data.entity.MedicalExam;

public interface MedicalExamRepository extends JpaRepository<MedicalExam, Long> {
}
