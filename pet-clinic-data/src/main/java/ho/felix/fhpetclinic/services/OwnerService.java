package ho.felix.fhpetclinic.services;

import ho.felix.fhpetclinic.model.Owner;

public interface OwnerService {
    public java.util.Set<Owner> findAll();
    public Owner findById(Long id);
    public Owner save(Owner owner);
    public java.util.Set<Owner> findByLastName(String lastName);
}
