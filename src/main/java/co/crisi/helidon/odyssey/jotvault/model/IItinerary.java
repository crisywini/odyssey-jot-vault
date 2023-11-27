package co.crisi.helidon.odyssey.jotvault.model;

import java.time.LocalDate;

public interface IItinerary {

    Long getItineraryId();

    IUser getUser();

    String getTitle();

    LocalDate getStartDate();

    LocalDate getEndDate();

}
