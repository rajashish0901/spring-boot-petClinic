package petclinic.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

    @ManyToOne
    private Owner owner;
    @ManyToOne
    private PetType petType;

    public Set<Visit> getVisits() {
        return visits;
    }

    public void setVisits(Set<Visit> visits) {
        this.visits = visits;
    }

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "pet")
    Set<Visit> visits;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "name")
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
