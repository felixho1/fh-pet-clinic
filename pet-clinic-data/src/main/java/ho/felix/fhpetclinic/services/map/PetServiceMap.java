package ho.felix.fhpetclinic.services.map;

import ho.felix.fhpetclinic.model.Pet;
import ho.felix.fhpetclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet save(Pet object) {
        map.put(object.getId(), object);
        return object;
    }
}