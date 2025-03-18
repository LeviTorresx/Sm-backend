package remington.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import remington.demo.data.entity.OccupationalData;

public interface OccupationalDataRepository extends JpaRepository<OccupationalData, Long> {
}
