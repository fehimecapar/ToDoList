package appcent.intern.appcent_applicationJ8.web;


import appcent.intern.appcent_applicationJ8.model.ToDoList;
import appcent.intern.appcent_applicationJ8.service.ToDoListService;
import appcent.intern.appcent_applicationJ8.web.dto.MessageResponse;
import appcent.intern.appcent_applicationJ8.web.request.AddJobRequest;
import appcent.intern.appcent_applicationJ8.web.request.UpdateJobRequest;
import appcent.intern.appcent_applicationJ8.web.response.JobQueryResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/jobs")
public class ToDoListController {

    private final ToDoListService toDoListService;

    public ToDoListController(final ToDoListService toDoListService) {
        this.toDoListService = toDoListService;
    }

    @GetMapping
    public List<JobQueryResponse> getAllJobs(){
        return toDoListService.getAllJobs()
                .stream()
                .map(job -> new JobQueryResponse(job))
                .toList();
    }

    @PostMapping
    public MessageResponse addEvents(@Valid @RequestBody final AddJobRequest addJobRequest) {
        ToDoList job = addJobRequest.toEntity();
        return toDoListService.addJob(job);
    }

    @PutMapping("/{id}")
    public MessageResponse updateStudent(@PathVariable final Long id, @Valid @RequestBody final UpdateJobRequest updateJobRequest) {
        return toDoListService.updateJob(id, updateJobRequest.toEntity());
    }

    @DeleteMapping("/{id}")
    public MessageResponse deleteEvent(@PathVariable Long id) {
        return toDoListService.deleteJob(id);
    }


}
