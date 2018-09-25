package petclinic.services.map;

import org.springframework.stereotype.Service;
import petclinic.model.Pet;
import petclinic.services.PetService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService <Pet,Long> implements PetService
{

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long iD) {
        return super.findById(iD);
    }
}
