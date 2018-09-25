package petclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {
    private Set<Speciality> specialitySet = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialitySet;
    }

    public void setSpecialities(Set<Speciality> specialitySet) {
        this.specialitySet = specialitySet;
    }
}
