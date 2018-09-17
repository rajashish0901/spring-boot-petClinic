package petclinic.services;

import java.util.Set;

/* Interface for generic CRUD operations on a repository for a specific type.*/
public interface CRUDService <T,ID>{

    Set<T> findAll();

    T findById(ID iD);
    T save(T object);
    void deleteBuId(ID id);

}
