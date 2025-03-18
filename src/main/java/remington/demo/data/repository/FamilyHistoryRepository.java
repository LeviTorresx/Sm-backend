package remington.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import remington.demo.data.entity.FamilyHistory;

public interface FamilyHistoryRepository extends JpaRepository<FamilyHistory, Long> {
}
