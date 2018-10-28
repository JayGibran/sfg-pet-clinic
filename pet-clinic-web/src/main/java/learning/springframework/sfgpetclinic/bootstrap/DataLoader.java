package learning.springframework.sfgpetclinic.bootstrap;

import learning.springframework.sfgpetclinic.model.*;
import learning.springframework.sfgpetclinic.services.OwnerService;
import learning.springframework.sfgpetclinic.services.PetTypeService;
import learning.springframework.sfgpetclinic.services.SpecialityService;
import learning.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private VetService vetService;

    @Autowired
    private PetTypeService petTypeService;

    @Autowired
    private SpecialityService specialityService;

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if(count == 0 ){
            loadData();
        }

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);


        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

        Owner owner = new Owner();
        owner.setFirstName("Emiriam");
        owner.setLastName("Caroline");
        owner.setAddress("123 Brickerel");
        owner.setCity("Miami");
        owner.setTelephone("12316123132");

        Pet loganPet = new Pet();
        loganPet.setPetType(cat);
        loganPet.setOwner(owner);
        loganPet.setName("Logan");
        loganPet.setBirthDate(LocalDate.now());

        owner.getPets().add(loganPet);

        ownerService.save(owner);

        Owner owner1 = new Owner();
        owner1.setFirstName("Jay");
        owner1.setLastName("Amaral");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("12316123132");

        Pet duckPet = new Pet();
        duckPet.setName("Duck");
        duckPet.setBirthDate(LocalDate.now());
        duckPet.setPetType(dog);
        duckPet.setOwner(owner1);

        owner1.getPets().add(duckPet);

        ownerService.save(owner1);

        Vet vet = new Vet();
        vet.setFirstName("Morty");
        vet.setLastName("Sanchez");
        vet.getSpecialities().add(savedDentistry);

        vetService.save(vet);

        Vet vet1 = new Vet();
        vet1.setFirstName("Rick");
        vet1.setLastName("Sachez");
        vet1.getSpecialities().add(savedSurgery);
        vetService.save(vet1);

    }
}
