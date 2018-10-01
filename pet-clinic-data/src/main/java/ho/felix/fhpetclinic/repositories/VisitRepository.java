package ho.felix.fhpetclinic.repositories;

import ho.felix.fhpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
