package ho.felix.fhpetclinic.services;

import ho.felix.fhpetclinic.model.Pet;

public interface PetService {
    public java.util.Set<Pet> findAll();
    public Pet findById(Long id);
    public Pet save(Pet pet);
}
