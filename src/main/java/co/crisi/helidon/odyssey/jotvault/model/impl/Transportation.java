package co.crisi.helidon.odyssey.jotvault.model.impl;

import co.crisi.helidon.odyssey.jotvault.model.IDestination;
import co.crisi.helidon.odyssey.jotvault.model.ITransportation;
import co.crisi.helidon.odyssey.jotvault.model.Mode;

import java.time.LocalDate;

public class Transportation implements ITransportation {

    private Long transportationId;

    private IDestination destination;

    private Mode mode;

    private LocalDate departureDateTime;

    private LocalDate arrivalDateTime;

    @Override
    public Long getTransportationId() {
        return transportationId;
    }

    @Override
    public IDestination getDestination() {
        return destination;
    }

    @Override
    public Mode getMode() {
        return mode;
    }

    @Override
    public LocalDate getDepartureDateTime() {
        return departureDateTime;
    }

    @Override
    public LocalDate getArrivalDateTime() {
        return arrivalDateTime;
    }
}
