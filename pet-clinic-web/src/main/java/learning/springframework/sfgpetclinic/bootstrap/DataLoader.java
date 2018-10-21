package learning.springframework.sfgpetclinic.bootstrap;

import learning.springframework.sfgpetclinic.model.Owner;
import learning.springframework.sfgpetclinic.model.Vet;
import learning.springframework.sfgpetclinic.services.OwnerService;
import learning.springframework.sfgpetclinic.services.VetService;
import learning.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import learning.springframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private OwnerService ownerService;
    private VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setFirstName("Emiriam");
        owner.setLastName("Caroline");
        owner.setId(1l);

        ownerService.save(owner);

        Owner owner1 = new Owner();
        owner1.setFirstName("Jay");
        owner1.setFirstName("Amaral");
        owner1.setId(2l);

        ownerService.save(owner1);

        System.out.println("Saving owners");

        Vet vet = new Vet();
        vet.setId(1l);
        vet.setFirstName("Logan");
        vet.setLastName("Logan");

        vetService.save(vet);

        Vet vet1 = new Vet();
        vet1.setId(1l);
        vet1.setFirstName("Max");
        vet1.setLastName("Max");

        vetService.save(vet1);

        System.out.println("Saving pet");
;    }
}
