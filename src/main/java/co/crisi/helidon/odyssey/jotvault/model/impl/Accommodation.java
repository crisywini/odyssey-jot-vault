package co.crisi.helidon.odyssey.jotvault.model.impl;

import co.crisi.helidon.odyssey.jotvault.model.IAccommodation;
import co.crisi.helidon.odyssey.jotvault.model.IDestination;

import java.time.LocalDate;

public class Accommodation implements IAccommodation {

    private Long accommodationId;

    private IDestination destination;

    private String name;

    private String address;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    @Override
    public Long getAccommodationId() {
        return accommodationId;
    }

    @Override
    public IDestination getDestination() {
        return destination;
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
