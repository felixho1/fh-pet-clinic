package ho.felix.fhpetclinic.repositories;

import ho.felix.fhpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
