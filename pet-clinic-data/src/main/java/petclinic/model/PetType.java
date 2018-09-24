package petclinic.model;

import petclinic.services.BaseEntity;

public class PetType extends BaseEntity {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
