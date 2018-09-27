package ho.felix.fhpetclinic.services.map;

import ho.felix.fhpetclinic.model.Owner;
import ho.felix.fhpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findByLastName(String lastName) {
        return map.entrySet().stream()
                .map(entry -> entry.getValue())
                .filter(entry -> entry.getLastName().equals(lastName))
                .collect(Collectors.toSet());
    }
}
