package learning.springframework.sfgpetclinic.services.springdatajpa;

import learning.springframework.sfgpetclinic.model.Speciality;
import learning.springframework.sfgpetclinic.repositories.SpecialtyRepository;
import learning.springframework.sfgpetclinic.services.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService {

    @Autowired
    private SpecialtyRepository repository;

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();

        repository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return repository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return repository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }
}
