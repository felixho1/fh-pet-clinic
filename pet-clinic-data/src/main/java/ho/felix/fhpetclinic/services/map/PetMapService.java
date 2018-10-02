package ho.felix.fhpetclinic.services.map;

import ho.felix.fhpetclinic.model.Pet;
import ho.felix.fhpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default","map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
}
