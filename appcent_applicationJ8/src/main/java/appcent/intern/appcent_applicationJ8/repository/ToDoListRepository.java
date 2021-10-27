package appcent.intern.appcent_applicationJ8.repository;

import appcent.intern.appcent_applicationJ8.model.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoListRepository extends JpaRepository<ToDoList, Long> {


}
