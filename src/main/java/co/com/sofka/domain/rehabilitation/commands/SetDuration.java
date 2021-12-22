package co.com.sofka.domain.rehabilitation.commands;

import co.com.sofka.generic.Duration;

public class SetDuration {

    private final Duration duration;

    public SetDuration(Duration duration) {
        this.duration = duration;
    }

    public Duration getDuration() {
        return duration;
    }
}
