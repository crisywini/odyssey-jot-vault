package co.crisi.helidon.odyssey.jotvault.adapter.jpamodel;

import co.crisi.helidon.odyssey.jotvault.model.IAccommodation;
import co.crisi.helidon.odyssey.jotvault.model.IActivity;
import co.crisi.helidon.odyssey.jotvault.model.IItinerary;
import co.crisi.helidon.odyssey.jotvault.model.ITransportation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "destination")
public class DestinationJpaEntity implements Serializable {


    @Id
    @Column(name = "destination_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long destinationId;

    private ItineraryJpaEntity itinerary;

    private String name;

    private String address;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @OneToMany(mappedBy = "destination")
    private List<AccommodationJpaEntity> accommodations;

    @OneToMany(mappedBy = "destination")
    private List<TransportationJpaEntity> transportations;

    @OneToMany(mappedBy = "destination")
    private List<ActivityJpaEntity> activities;

}
