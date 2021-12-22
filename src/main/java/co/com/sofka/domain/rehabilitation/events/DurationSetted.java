package co.com.sofka.domain.rehabilitation.events;

import co.com.sofka.generic.Duration;
import co.com.sofka.generic.DomainEvent;

public class DurationSetted extends DomainEvent {

    private final Duration duration;

    public DurationSetted(Duration duration) {
        super("sofka.rehabilitation.durationSetted");
        this.duration = duration;
    }

    public Duration Duration() {
        return duration;
    }
}
