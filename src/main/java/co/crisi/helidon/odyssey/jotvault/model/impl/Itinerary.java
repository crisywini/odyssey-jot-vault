package co.crisi.helidon.odyssey.jotvault.model.impl;

import co.crisi.helidon.odyssey.jotvault.model.IDestination;
import co.crisi.helidon.odyssey.jotvault.model.IItinerary;
import co.crisi.helidon.odyssey.jotvault.model.IUser;

import java.time.LocalDate;
import java.util.List;

public class Itinerary implements IItinerary {

    private Long itineraryId;

    private IUser user;

    private String title;

    private LocalDate startDate;

    private LocalDate endDate;

    private List<IDestination> destinations;

    @Override
    public Long getItineraryId() {
        return itineraryId;
    }

    @Override
    public IUser getUser() {
        return user;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public List<IDestination> getDestinations() {
        return destinations;
    }
}
