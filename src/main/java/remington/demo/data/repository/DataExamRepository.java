package remington.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import remington.demo.data.entity.DataExam;

public interface DataExamRepository extends JpaRepository<DataExam, Long> {
}
