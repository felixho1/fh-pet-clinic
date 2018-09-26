package ho.felix.fhpetclinic.services;

import ho.felix.fhpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    public Set<Owner> findByLastName(String lastName);
}
