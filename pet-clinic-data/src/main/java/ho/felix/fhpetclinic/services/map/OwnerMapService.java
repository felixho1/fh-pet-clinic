package ho.felix.fhpetclinic.services.map;

import ho.felix.fhpetclinic.model.Owner;
import ho.felix.fhpetclinic.model.Pet;
import ho.felix.fhpetclinic.services.OwnerService;
import ho.felix.fhpetclinic.services.PetService;
import ho.felix.fhpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@Profile({"default","map"})
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findByLastName(String lastName) {
        return map.entrySet().stream()
                .map(entry -> entry.getValue())
                .filter(entry -> entry.getLastName().equals(lastName))
                .collect(Collectors.toSet());
    }

    @Override
    public Owner save(Owner object) {
        if(object != null){
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null){
                        if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is required");
                    }
                    if(pet.getId() == null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }
    }
}
