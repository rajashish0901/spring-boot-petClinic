package petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import petclinic.model.Speciality;
import petclinic.model.Vet;

public interface VetRepository extends CrudRepository <Vet,Long> {
}
