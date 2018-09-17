package petclinic.services;

import java.io.Serializable;

public class BaseEntity implements Serializable {


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    Long id;

}
