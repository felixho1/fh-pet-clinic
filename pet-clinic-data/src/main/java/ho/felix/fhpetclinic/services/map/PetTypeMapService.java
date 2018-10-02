package ho.felix.fhpetclinic.services.map;

import ho.felix.fhpetclinic.model.PetType;
import ho.felix.fhpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default","map"})
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

}
