package learning.springframework.sfgpetclinic.services.springdatajpa;

import learning.springframework.sfgpetclinic.model.PetType;
import learning.springframework.sfgpetclinic.repositories.PetTypeRepository;
import learning.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class PetTypeSDJpaService implements PetTypeService {

    @Autowired
    private PetTypeRepository repository;

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes =  new HashSet<>();
        repository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return repository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return repository.save(object);
    }

    @Override
    public void delete(PetType object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }
}
