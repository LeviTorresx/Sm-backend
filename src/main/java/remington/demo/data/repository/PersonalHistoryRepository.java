package remington.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import remington.demo.data.entity.PersonalHistory;

public interface PersonalHistoryRepository extends JpaRepository<PersonalHistory, Long> {
}
