package ho.felix.fhpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Vet extends Person {
    @OneToMany
    @JoinTable(
            name = "vet_specialities",
            joinColumns = { @JoinColumn(name = "vet_id") },
            inverseJoinColumns = { @JoinColumn(name = "speciality_id") }
    )
    private Set<Speciality> specialities = new HashSet<>();

}
