package appcent.intern.appcent_applicationJ8.model;


import appcent.intern.appcent_applicationJ8.common.Entity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="messages") //mesaj bilgilerinin tutuldugu tablo
public class Message extends BaseEntity {

    @Column(nullable = false)
    private String content;

}
