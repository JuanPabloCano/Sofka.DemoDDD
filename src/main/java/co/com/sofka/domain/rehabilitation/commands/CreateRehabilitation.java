package co.com.sofka.domain.rehabilitation.commands;

import co.com.sofka.enum_.Status;
import co.com.sofka.domain.rehabilitation.PhysicalTherapist;
import co.com.sofka.domain.rehabilitation.User;
import co.com.sofka.domain.rehabilitation.values.Diagnostic_;
import co.com.sofka.generic.Difficulty;
import co.com.sofka.generic.Duration;

public class CreateRehabilitation {

    private final User user;
    private final PhysicalTherapist physicalTherapist;
    private final Duration duration;
    private final Diagnostic_ diagnostics;
    private final Status status;
    private final Difficulty difficulty;

    public CreateRehabilitation(User user, PhysicalTherapist physicalTherapist, Duration duration, Diagnostic_ diagnostics, Status status, Difficulty difficulty) {
        this.user = user;
        this.physicalTherapist = physicalTherapist;
        this.duration = duration;
        this.diagnostics = diagnostics;
        this.status = status;
        this.difficulty = difficulty;
    }

    public User getUser() {
        return user;
    }

    public PhysicalTherapist getPhysicalTherapist() {
        return physicalTherapist;
    }

    public Duration getDuration() {
        return duration;
    }

    public Diagnostic_ getDiagnostics() {
        return diagnostics;
    }

    public Status getStatus() {
        return status;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }
}
