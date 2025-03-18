package remington.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import remington.demo.data.entity.PersonalData;

public interface PersonalDataRepository extends JpaRepository<PersonalData,Long > {
}
