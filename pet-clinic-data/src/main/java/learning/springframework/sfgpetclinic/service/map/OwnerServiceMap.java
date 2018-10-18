package learning.springframework.sfgpetclinic.service.map;

import learning.springframework.sfgpetclinic.model.Owner;
import learning.springframework.sfgpetclinic.service.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbastractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

}
