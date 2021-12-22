package co.com.sofka.domain.categoryManagement.events;

import co.com.sofka.generic.DomainEvent;
import co.com.sofka.generic.Duration;

public class DurationChanged extends DomainEvent {

    private final Duration duration;

    public DurationChanged(Duration duration) {
        super("sofka.categoryManagement.durationChanged");
        this.duration = duration;
    }

    public Duration Duration() {
        return duration;
    }
}
