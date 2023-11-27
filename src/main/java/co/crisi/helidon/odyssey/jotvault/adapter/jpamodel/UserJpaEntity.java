package co.crisi.helidon.odyssey.jotvault.adapter.jpamodel;

import co.crisi.helidon.odyssey.jotvault.model.IItinerary;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "traveler")
public class UserJpaEntity implements Serializable {

    @Id
    private Long userId;

    private String username;

    private String email;

    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;


}
