package learning.springframework.sfgpetclinic.services;

import learning.springframework.sfgpetclinic.model.Owner;

import java.util.List;
import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}

