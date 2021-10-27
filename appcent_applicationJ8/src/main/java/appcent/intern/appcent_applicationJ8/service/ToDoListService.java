package appcent.intern.appcent_applicationJ8.service;

import appcent.intern.appcent_applicationJ8.model.ToDoList;
import appcent.intern.appcent_applicationJ8.repository.ToDoListRepository;
import appcent.intern.appcent_applicationJ8.web.dto.MessageResponse;
import appcent.intern.appcent_applicationJ8.web.dto.MessageType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ToDoListService {

    private final ToDoListRepository toDoRepository;

    public ToDoListService(final ToDoListRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Transactional
    public MessageResponse addJob(ToDoList job) {
        toDoRepository.save(job);
        return new MessageResponse("job has been saved successfully!", MessageType.SUCCESS);
    }

    public List<ToDoList> getAllJobs() {
        return toDoRepository.findAll();
    }

    @Transactional
    public MessageResponse updateJob(Long id, ToDoList newEvent) {
        ToDoList event = toDoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Job not found"));
        event.updateJob(newEvent);
        toDoRepository.save(event);

        return new MessageResponse("Job  has been updated successfully!", MessageType.SUCCESS);
    }

    public MessageResponse deleteJob(Long id) {
        toDoRepository.deleteById(id);

        return new MessageResponse("Job has been deleted successfully!", MessageType.SUCCESS);
    }

}
