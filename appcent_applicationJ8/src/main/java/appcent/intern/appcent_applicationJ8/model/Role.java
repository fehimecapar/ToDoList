package appcent.intern.appcent_applicationJ8.model;


import appcent.intern.appcent_applicationJ8.common.Entity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor// argümansız constructor
public class Role extends BaseEntity {

    private String name;

    public Role(String name){

        this.name =name;
    }

    @Override
    public String toString(){

        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
