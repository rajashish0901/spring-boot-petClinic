package petclinic.services.map;

import petclinic.model.Speciality;
import petclinic.services.SpecialityService;

import java.util.Set;

public class SpecialityMapService extends AbstractMapService <Speciality,Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long iD) {
        return super.findById(iD);
    }
}