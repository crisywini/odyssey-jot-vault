package co.crisi.helidon.odyssey.jotvault.model;

import java.time.LocalDate;

public interface IActivity {

    Long getActivityId();

    IDestination getDestination();

    String getName();

    LocalDate getDateTime();

    String getLocation();

}
