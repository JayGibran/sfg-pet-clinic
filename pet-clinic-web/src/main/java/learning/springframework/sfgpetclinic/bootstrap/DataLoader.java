package learning.springframework.sfgpetclinic.bootstrap;

import learning.springframework.sfgpetclinic.model.Owner;
import learning.springframework.sfgpetclinic.model.PetType;
import learning.springframework.sfgpetclinic.model.Vet;
import learning.springframework.sfgpetclinic.services.OwnerService;
import learning.springframework.sfgpetclinic.services.PetTypeService;
import learning.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private VetService vetService;

    @Autowired
    private PetTypeService petTypeService;


    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);


        Owner owner = new Owner();
        owner.setFirstName("Emiriam");
        owner.setLastName("Caroline");

        ownerService.save(owner);

        Owner owner1 = new Owner();
        owner1.setFirstName("Jay");
        owner1.setLastName("Amaral");

        ownerService.save(owner1);

        System.out.println("Saving owners");

        Vet vet = new Vet();
        vet.setFirstName("Morty");
        vet.setLastName("Sanchez");

        vetService.save(vet);

        Vet vet1 = new Vet();
        vet1.setFirstName("Rick");
        vet1.setLastName("Sachez");

        vetService.save(vet1);

        System.out.println("Saving pet");
;    }
}
