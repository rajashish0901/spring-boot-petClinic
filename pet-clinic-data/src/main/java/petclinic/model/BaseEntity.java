package petclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
/*From a database perspective, the @MappedSuperclass inheritance model is invisible since
all the base class properties are simply copied to the database table mapped by the actual
entity class.*/
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    Long id;

}
