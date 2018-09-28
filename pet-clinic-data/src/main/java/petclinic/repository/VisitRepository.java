package petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import petclinic.model.Vet;
import petclinic.model.Visit;

public interface VisitRepository extends CrudRepository <Visit,Long> {
}
