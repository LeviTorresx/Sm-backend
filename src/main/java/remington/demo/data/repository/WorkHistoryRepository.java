package remington.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import remington.demo.data.entity.WorkHistory;

public interface WorkHistoryRepository extends JpaRepository<WorkHistory, Long> {
}
