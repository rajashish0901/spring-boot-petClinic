package petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import petclinic.model.Owner;
import petclinic.services.CRUDService;

public interface OwnerRespository extends CrudRepository <Owner,Long> {

}
