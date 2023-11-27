package co.crisi.helidon.odyssey.jotvault.model;

import java.time.LocalDate;
import java.util.List;

public interface IDestination {

    Long getDestinationId();

    IItinerary getItinerary();

    String getName();

    String getAddress();

    LocalDate getStartDate();

    LocalDate getEndDate();

    List<IAccommodation> getAccommodations();


}
