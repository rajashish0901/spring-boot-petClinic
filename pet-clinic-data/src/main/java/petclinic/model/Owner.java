package petclinic.model;

import java.util.Set;

public class Owner extends Person {
    Set<Pet> m_pet;

    public Set<Pet> getM_pet() {
        return m_pet;
    }

    public void setM_pet(Set<Pet> m_pet) {
        this.m_pet = m_pet;
    }
}
