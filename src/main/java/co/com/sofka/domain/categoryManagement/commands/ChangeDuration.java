package co.com.sofka.domain.categoryManagement.commands;

import co.com.sofka.generic.Duration;

public class ChangeDuration {

    private final Duration duration;

    public ChangeDuration(Duration duration) {
        this.duration = duration;
    }

    public Duration getDuration() {
        return duration;
    }
}
