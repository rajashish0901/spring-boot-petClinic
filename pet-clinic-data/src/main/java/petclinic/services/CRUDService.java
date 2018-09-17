package petclinic.services;

import petclinic.model.Owner;

import java.util.Set;

/* Interface for generic CRUD operations on a repository for a specific type.*/
public interface CRUDService <T,ID>{

    Set<T> findAll();

    T findById(ID iD);
    T save(T object);
    void deleteById(ID id);
    void delete(T object);
}
