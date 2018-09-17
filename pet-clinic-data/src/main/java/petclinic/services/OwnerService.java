package petclinic.services;

import petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long Id);
    Owner findByLastName(String name);
    Owner save(Owner owner);
    Set<Owner> findAllOwner();
}
