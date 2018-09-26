package ho.felix.fhpetclinic.services;

import ho.felix.fhpetclinic.model.Vet;

public interface VetService {
    public java.util.Set<Vet> findAll();
    public Vet findById(Long id);
    public Vet save(Vet vet);
}
