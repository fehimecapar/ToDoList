package appcent.intern.appcent_applicationJ8.repository;

import appcent.intern.appcent_applicationJ8.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {


}
