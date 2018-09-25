package petclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import petclinic.model.*;
import petclinic.services.OwnerService;
import petclinic.services.PetTypeService;
import petclinic.services.SpecialityService;
import petclinic.services.VetService;
import petclinic.services.map.OwnerServiceMap;
import petclinic.services.map.VetServiceMap;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    OwnerService m_ownerService;
    VetService   m_vetService;
    PetTypeService m_petTypeService;
    SpecialityService m_specialityService;

    DataLoader(OwnerServiceMap ownerServiceMap,VetServiceMap vetServiceMap,PetTypeService petTypeService,
               SpecialityService specialityService){
        System.out.println("@@ DataLoader::Const(args) @@");

        //Approach#1
        //m_ownerService = new OwnerServiceMap();
        //m_vetService = new VetServiceMap();

        //Approach#2// Define the module as Spring Bean so that it can be initialized during the app startup.
        m_ownerService = ownerServiceMap;
        m_vetService = vetServiceMap;
        m_petTypeService = petTypeService;
        m_specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData() {

        System.out.println("@@ DataLoader::loadData(...) @@");


        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = m_petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = m_petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = m_specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = m_specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("dentistry");
        Speciality savedDentistry = m_specialityService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1231231234");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        m_ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("1231231234");

        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);

        m_ownerService.save(owner2);

        /*Visit catVisit = new Visit();
        catVisit.setPet(fionasCat);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Sneezy Kitty");

        visitService.save(catVisit);*/

        System.out.println("Loaded Owners....");
        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
       vet1.getSpecialities().add(savedRadiology);

        m_vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(savedSurgery);

        m_vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
