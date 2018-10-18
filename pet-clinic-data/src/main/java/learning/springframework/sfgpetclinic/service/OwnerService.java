package learning.springframework.sfgpetclinic.service;

import learning.springframework.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}

