package ho.felix.fhpetclinic.services.map;

import ho.felix.fhpetclinic.model.Vet;
import ho.felix.fhpetclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
}
