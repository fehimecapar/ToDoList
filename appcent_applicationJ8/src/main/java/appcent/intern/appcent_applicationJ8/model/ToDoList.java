package appcent.intern.appcent_applicationJ8.model;

import appcent.intern.appcent_applicationJ8.common.Entity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Getter
@NoArgsConstructor
public class ToDoList extends BaseEntity {

    private String job_title; //yapılacak işin başlığı
    private String job_content; //yapılacak işin içeriği

    public ToDoList(String title, String content){
        this.job_title = title;
        this.job_content = content;
    }

    public void updateJob( ToDoList newJob){
        this.job_title = newJob.job_title;
        this.job_content = newJob.job_content;
    }
}
