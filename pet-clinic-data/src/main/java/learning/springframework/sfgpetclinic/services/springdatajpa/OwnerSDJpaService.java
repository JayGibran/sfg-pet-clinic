package learning.springframework.sfgpetclinic.services.springdatajpa;

import learning.springframework.sfgpetclinic.model.Owner;
import learning.springframework.sfgpetclinic.repositories.OwnerRepository;
import learning.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    @Autowired
    private OwnerRepository repository;


    @Override
    public Owner findByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

    @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        return repository.findAllByLastNameLike(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        repository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return repository.findById(aLong).orElse(null);

    }

    @Override
    public Owner save(Owner object) {
        return repository.save(object);
    }

    @Override
    public void delete(Owner object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }
}
