package remington.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import remington.demo.data.entity.Evaluation;

public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {
}
