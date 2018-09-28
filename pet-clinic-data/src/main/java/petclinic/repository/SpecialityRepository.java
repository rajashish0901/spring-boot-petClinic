package petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import petclinic.model.PetType;
import petclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository <Speciality,Long> {
}
