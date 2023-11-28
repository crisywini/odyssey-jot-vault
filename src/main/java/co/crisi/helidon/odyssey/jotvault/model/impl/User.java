package co.crisi.helidon.odyssey.jotvault.model.impl;

import co.crisi.helidon.odyssey.jotvault.model.IItinerary;
import co.crisi.helidon.odyssey.jotvault.model.IUser;
import lombok.Builder;

import java.util.List;

/**
 * Attributes: UserID (Primary Key), Username, Email, Password, FirstName, LastName.
 */
@Builder
public class User implements IUser {

    private Long userId;

    private String username;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private List<IItinerary> itineraries;


    @Override
    public Long getUserId() {
        return userId;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public List<IItinerary> getItineraries() {
        return itineraries;
    }
}
