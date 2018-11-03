package learning.springframework.sfgpetclinic.services.springdatajpa;

import learning.springframework.sfgpetclinic.model.Pet;
import learning.springframework.sfgpetclinic.repositories.PetRepository;
import learning.springframework.sfgpetclinic.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {

    @Autowired
    private PetRepository repository;

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        repository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return repository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return repository.save(object);
    }

    @Override
    public void delete(Pet object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }
}
