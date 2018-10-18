package learning.springframework.sfgpetclinic.service.map;

import learning.springframework.sfgpetclinic.model.Vet;
import learning.springframework.sfgpetclinic.service.CrudService;

import java.util.Set;

public class VetServiceMap extends AbastractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }
}
