package ho.felix.fhpetclinic.repositories;

import ho.felix.fhpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
