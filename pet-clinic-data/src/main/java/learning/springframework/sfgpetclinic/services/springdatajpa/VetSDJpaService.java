package learning.springframework.sfgpetclinic.services.springdatajpa;


import learning.springframework.sfgpetclinic.model.Vet;
import learning.springframework.sfgpetclinic.repositories.VetRepository;
import learning.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    @Autowired
    private VetRepository repository;

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        repository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return repository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return repository.save(object);
    }

    @Override
    public void delete(Vet object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }
}
