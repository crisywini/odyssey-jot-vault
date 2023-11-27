package co.crisi.helidon.odyssey.jotvault.model.impl;

import co.crisi.helidon.odyssey.jotvault.model.IDestination;
import co.crisi.helidon.odyssey.jotvault.model.IItinerary;

import java.time.LocalDate;

public class Destination implements IDestination {

    private Long destinationId;

    private IItinerary itinerary;

    private String name;

    private String address;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

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
    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    @Override
    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }
}
