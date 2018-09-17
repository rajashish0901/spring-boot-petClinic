package petclinic.services;

import petclinic.model.Owner;
import petclinic.model.Pet;

import java.util.Set;

public interface PerService {
    Pet findById(Long Id);
    Pet findByLastName(String name);
    Pet save(Pet pet);
    Set<Pet> findAllOwner();
}
