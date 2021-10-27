package appcent.intern.appcent_applicationJ8.model;

import appcent.intern.appcent_applicationJ8.common.Entity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter //lombok
@Setter
@NoArgsConstructor //lombok
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))

public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name= "users_roles",
            joinColumns = @JoinColumn(
                    name= "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name= "role_id",referencedColumnName = "id"))

    private Collection<Role> roles;

    public User(String firstName, String lastName, String email, String password){

        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
    }

    //getter ve setter methodları için lombok kullanılmıştır.

    @Override
    public String toString(){
        return "User{"+
                "id="+ id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + "*********" + '\'' +
                ", roles=" + roles +
                '}';

    }
}
