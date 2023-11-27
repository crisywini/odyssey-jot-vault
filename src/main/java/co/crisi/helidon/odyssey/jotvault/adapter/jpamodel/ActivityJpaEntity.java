package co.crisi.helidon.odyssey.jotvault.adapter.jpamodel;

import co.crisi.helidon.odyssey.jotvault.model.IDestination;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "activity")
public class ActivityJpaEntity implements Serializable {

    @Id
    @Column(name = "activity_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long activityId;

    @ManyToOne
    private DestinationJpaEntity destination;

    private String name;

    @Column(name = "date_time")
    private LocalDate dateTime;

    private String location;

}
