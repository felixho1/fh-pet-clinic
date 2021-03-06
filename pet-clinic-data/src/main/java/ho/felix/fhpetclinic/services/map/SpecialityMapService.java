package ho.felix.fhpetclinic.services.map;

import ho.felix.fhpetclinic.model.Speciality;
import ho.felix.fhpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default","map"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {
}
