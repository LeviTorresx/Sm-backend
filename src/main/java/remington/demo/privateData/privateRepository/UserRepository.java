package remington.demo.privateData.privateRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import remington.demo.privateData.privateEntity.User;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String userName);
}
