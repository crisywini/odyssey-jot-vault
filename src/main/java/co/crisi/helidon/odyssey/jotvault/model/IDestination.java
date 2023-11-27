package co.crisi.helidon.odyssey.jotvault.model;

import java.time.LocalDate;

public interface IDestination {

    Long getDestinationId();

    IItinerary getItinerary();

    String getName();

    String getAddress();

    LocalDate getCheckInDate();

    LocalDate getCheckOutDate();


}
