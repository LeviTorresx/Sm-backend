package remington.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import remington.demo.data.entity.GynecoObstetricHistory;

public interface GynecoObstetricHistoryRepository extends JpaRepository<GynecoObstetricHistory, Long> {
}
