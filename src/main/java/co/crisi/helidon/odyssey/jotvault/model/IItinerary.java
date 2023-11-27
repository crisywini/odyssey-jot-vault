package co.crisi.helidon.odyssey.jotvault.model;

import java.time.LocalDate;
import java.util.List;

public interface IItinerary {

    Long getItineraryId();

    IUser getUser();

    String getTitle();

    LocalDate getStartDate();

    LocalDate getEndDate();

    List<IDestination> getDestinations();

}
