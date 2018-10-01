package ho.felix.fhpetclinic.services.map;

import ho.felix.fhpetclinic.model.Visit;
import ho.felix.fhpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {
}
