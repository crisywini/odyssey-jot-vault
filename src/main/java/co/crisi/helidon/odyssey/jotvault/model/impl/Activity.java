package co.crisi.helidon.odyssey.jotvault.model.impl;

import co.crisi.helidon.odyssey.jotvault.model.IActivity;
import co.crisi.helidon.odyssey.jotvault.model.IDestination;

import java.time.LocalDate;

public class Activity implements IActivity {

    private Long activityId;

    private IDestination destination;

    private String name;

    private LocalDate dateTime;

    private String location;

    @Override
    public Long getActivityId() {
        return activityId;
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
    public LocalDate getDateTime() {
        return dateTime;
    }

    @Override
    public String getLocation() {
        return location;
    }
}
