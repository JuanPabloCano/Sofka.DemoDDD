package co.com.sofka.domain.categoryManagement.events;

import co.com.sofka.generic.DomainEvent;
import co.com.sofka.generic.Duration;

public class DurationSetted extends DomainEvent {

    private final Duration duration;

    public DurationSetted(Duration duration) {
        super("sofka.categoryManagement.durationSetted");
        this.duration = duration;
    }

    public Duration Duration() {
        return duration;
    }
}
