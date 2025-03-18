package remington.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import remington.demo.data.entity.ExamsPerformed;

public interface ExamsPerformedRepository extends JpaRepository<ExamsPerformed, Long> {
}
