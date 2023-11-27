package co.crisi.helidon.odyssey.jotvault.model;

import java.time.LocalDate;

public interface IAccommodation {


    Long getAccommodationId();

    IDestination getDestination();

    String getName();

    String getAddress();

    LocalDate getCheckInDate();

    LocalDate getCheckOutDate();

}
