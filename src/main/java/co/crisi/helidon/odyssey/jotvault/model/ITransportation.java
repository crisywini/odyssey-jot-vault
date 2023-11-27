package co.crisi.helidon.odyssey.jotvault.model;

import java.time.LocalDate;

public interface ITransportation {

    Long getTransportationId();

    IDestination getDestination();

    Mode getMode();

    LocalDate getDepartureDateTime();

    LocalDate getArrivalDateTime();

}
