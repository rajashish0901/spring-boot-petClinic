package petclinic.model;

import petclinic.services.BaseEntity;

import java.time.LocalDate;

public class Pet extends BaseEntity {
    private Owner owner;
    private PetType petType;
    private LocalDate birthDate;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getPetType() {
        return petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setPetType(PetType type) {
        this.petType = type;
    }
}
