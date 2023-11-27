package co.crisi.helidon.odyssey.jotvault.model.impl;

import co.crisi.helidon.odyssey.jotvault.model.*;

import java.time.LocalDate;
import java.util.List;

public class Destination implements IDestination {

    private Long destinationId;

    private IItinerary itinerary;

    private String name;

    private String address;

    private LocalDate startDate;

    private LocalDate endDate;

    private List<IAccommodation> accommodations;

    private List<ITransportation> transportations;

    private List<IActivity> activities;

    @Override
    public Long getDestinationId() {
        return destinationId;
    }

    @Override
    public IItinerary getItinerary() {
        return itinerary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
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
    public List<IAccommodation> getAccommodations() {
        return accommodations;
    }

    @Override
    public List<ITransportation> getTransportations() {
        return transportations;
    }

    @Override
    public List<IActivity> getActivities() {
        return activities;
    }
}
