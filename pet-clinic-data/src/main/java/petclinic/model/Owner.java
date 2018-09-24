package petclinic.model;

import java.util.Set;

public class Owner extends Person {
    private String address;
    private String telephone;
    private String city;

    Set<Pet> m_pet;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<Pet> getM_pet() {
        return m_pet;
    }

    public void setM_pet(Set<Pet> m_pet) {
        this.m_pet = m_pet;
    }
}
