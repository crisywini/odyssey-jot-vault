package co.crisi.helidon.odyssey.jotvault.model;

import java.util.List;

public interface IUser {

    Long getUserId();

    String getUsername();

    String getEmail();

    String getPassword();

    String getFirstName();

    String getLastName();

    List<IItinerary> getItineraries();

}
