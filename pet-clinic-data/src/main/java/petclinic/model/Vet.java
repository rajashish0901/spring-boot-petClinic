package petclinic.model;

import org.hibernate.engine.profile.Fetch;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vet")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Speciality> specialitySet = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialitySet;
    }

    public void setSpecialities(Set<Speciality> specialitySet) {
        this.specialitySet = specialitySet;
    }
}
