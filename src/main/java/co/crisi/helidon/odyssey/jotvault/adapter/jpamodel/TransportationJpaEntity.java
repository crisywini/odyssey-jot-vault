package co.crisi.helidon.odyssey.jotvault.adapter.jpamodel;

import co.crisi.helidon.odyssey.jotvault.model.IDestination;
import co.crisi.helidon.odyssey.jotvault.model.Mode;
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
@Table(name = "transportation")
public class TransportationJpaEntity implements Serializable {


    @Id
    @Column(name = "transportation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transportationId;

    @ManyToOne
    private DestinationJpaEntity destination;

    private Mode mode;

    @Column(name = "departure_date_time")
    private LocalDate departureDateTime;

    @Column(name = "arrival_date_time")
    private LocalDate arrivalDateTime;
}
