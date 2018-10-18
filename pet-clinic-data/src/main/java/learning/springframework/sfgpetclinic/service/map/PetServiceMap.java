package learning.springframework.sfgpetclinic.service.map;

import learning.springframework.sfgpetclinic.model.Pet;
import learning.springframework.sfgpetclinic.service.CrudService;

import java.util.Set;

public class PetServiceMap extends AbastractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }
}
