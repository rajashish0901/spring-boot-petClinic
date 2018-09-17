package petclinic.services;

import petclinic.model.Pet;
import petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long Id);
    Vet findByLastName(String name);
    Vet save(Vet vet);
    Set<Vet> findAllOwner();
}
