package ho.felix.fhpetclinic.repositories;

import ho.felix.fhpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
