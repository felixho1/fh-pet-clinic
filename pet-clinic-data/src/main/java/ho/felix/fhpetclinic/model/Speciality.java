package ho.felix.fhpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialities")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Speciality extends BaseEntity {
    @Column(name = "description")
    private String description;

}