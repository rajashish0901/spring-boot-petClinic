package petclinic.services.map;

import petclinic.model.Vet;
import petclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService <Vet,Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }

    @Override
    public Vet findById(Long iD) {
        return super.findById(iD);
    }
}
