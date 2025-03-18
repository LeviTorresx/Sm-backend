package remington.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import remington.demo.data.entity.Risks;

public interface RisksRepository extends JpaRepository<Risks, Long> {
}
