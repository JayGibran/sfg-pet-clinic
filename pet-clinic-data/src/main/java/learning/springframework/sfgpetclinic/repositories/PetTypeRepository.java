package learning.springframework.sfgpetclinic.repositories;

import learning.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<Pet, Long> {

}
