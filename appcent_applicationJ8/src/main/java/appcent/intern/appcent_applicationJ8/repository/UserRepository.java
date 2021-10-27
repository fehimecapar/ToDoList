package appcent.intern.appcent_applicationJ8.repository;

import appcent.intern.appcent_applicationJ8.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
