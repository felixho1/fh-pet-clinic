package ho.felix.fhpetclinic.services.map;

import ho.felix.fhpetclinic.model.PetType;
import ho.felix.fhpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

}
