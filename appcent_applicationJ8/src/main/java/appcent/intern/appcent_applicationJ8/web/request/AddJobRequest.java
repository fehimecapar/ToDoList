package appcent.intern.appcent_applicationJ8.web.request;

import appcent.intern.appcent_applicationJ8.model.ToDoList;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@RequiredArgsConstructor
@Getter
@ToString
public class AddJobRequest {

    private final String job_title;
    private final String job_content;


    public ToDoList toEntity() {
        return new ToDoList(job_title, job_content);
    }

}
