package learning.springframework.sfgpetclinic.services.map;

import learning.springframework.sfgpetclinic.model.Speciality;
import learning.springframework.sfgpetclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
    public class SpecialityServiceMap extends AbastractMapService<Speciality, Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return super.save(speciality);
    }

    @Override
    public void delete(Speciality speciality) {
        super.delete(speciality);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
