package springbootexample.springpetclinic.model;

import java.time.LocalDate;

public class Pet {
    private Owner owner;
    private PetType type;
    private LocalDate birthdate;

    public PetType getType() {
        return type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setType(PetType type) {
        this.type = type;
    }
}
