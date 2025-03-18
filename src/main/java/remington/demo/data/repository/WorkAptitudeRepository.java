package remington.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import remington.demo.data.entity.WorkAptitude;

public interface WorkAptitudeRepository extends JpaRepository<WorkAptitude, Long> {
}
