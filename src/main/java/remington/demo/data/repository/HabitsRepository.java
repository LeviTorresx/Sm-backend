package remington.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import remington.demo.data.entity.Habits;

public interface HabitsRepository extends JpaRepository<Habits, Long> {
}
