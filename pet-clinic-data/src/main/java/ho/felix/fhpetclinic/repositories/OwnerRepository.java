package ho.felix.fhpetclinic.repositories;

import ho.felix.fhpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Set<Owner> findByLastName(String lastName);
}
