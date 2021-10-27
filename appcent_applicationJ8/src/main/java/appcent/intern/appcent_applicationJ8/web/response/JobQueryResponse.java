package appcent.intern.appcent_applicationJ8.web.response;

import appcent.intern.appcent_applicationJ8.model.ToDoList;
import lombok.Getter;

@Getter
public class JobQueryResponse {

    private final Long id;
    private final String job_title;
    private final String job_content;

    public JobQueryResponse(Object job) {
        this.id = job.getId();
        this.job_title = job.getJob_title();
        this.job_content = job.getJob_content();

    }
}
