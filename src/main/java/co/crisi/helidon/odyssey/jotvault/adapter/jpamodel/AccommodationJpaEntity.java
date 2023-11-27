package co.crisi.helidon.odyssey.jotvault.adapter.jpamodel;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "accommodation")
public class AccommodationJpaEntity implements Serializable {

    @Id
    @Column(name = "accommodation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accommodationId;

    @OneToMany
    private DestinationJpaEntity destination;

    private String name;

    private String address;

    @Column(name = "check_in_date")
    private LocalDate checkInDate;

    @Column(name = "check_out_date")
    private LocalDate checkOutDate;

}
