package co.com.sofka.domain.rehabilitation.events;

import co.com.sofka.enum_.Status;
import co.com.sofka.domain.rehabilitation.PhysicalTherapist;
import co.com.sofka.domain.rehabilitation.User;
import co.com.sofka.domain.rehabilitation.values.Diagnostic_;
import co.com.sofka.generic.Difficulty;
import co.com.sofka.generic.Duration;
import co.com.sofka.generic.DomainEvent;

import java.util.List;

public class RehabilitationCreated extends DomainEvent {


    private final User user;
    private final PhysicalTherapist physicalTherapist;
    private final Duration duration;
    private final List<Diagnostic_> diagnostics;
    private final Status status;
    private final Difficulty difficulty;

    public RehabilitationCreated(User user, PhysicalTherapist physicalTherapist, Duration duration, List<Diagnostic_> diagnostics, Status status, Difficulty difficulty) {
        super("sofka.rehabilitation.rehabilitationCreated");
        this.user = user;
        this.physicalTherapist = physicalTherapist;
        this.duration = duration;
        this.diagnostics = diagnostics;
        this.status = status;
        this.difficulty = difficulty;
    }

    public User User() {
        return user;
    }

    public PhysicalTherapist PhysicalTherapist() {
        return physicalTherapist;
    }

    public Duration Duration() {
        return duration;
    }

    public List<Diagnostic_> Diagnostics() {
        return diagnostics;
    }

    public Status Status() {
        return status;
    }

    public Difficulty Difficulty() {
        return difficulty;
    }
}
