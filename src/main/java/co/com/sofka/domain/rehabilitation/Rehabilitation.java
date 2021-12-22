package co.com.sofka.domain.rehabilitation;

import co.com.sofka.domain.academy.events.statusSetted;
import co.com.sofka.enum_.Status;
import co.com.sofka.domain.rehabilitation.events.*;
import co.com.sofka.domain.rehabilitation.values.*;
import co.com.sofka.generic.*;

import java.util.List;
import java.util.Objects;

public class Rehabilitation extends AggregateRoot<RehabilitationId> {

    // Entities
    private final User user;
    private final PhysicalTherapist physicalTherapist;

    // Value objects
    private final Duration duration;
    private final List<Diagnostic_> diagnostics;
    private final Status status;
    private final Difficulty difficulty;

    public Rehabilitation(RehabilitationId rehabilitationId, User user, PhysicalTherapist physicalTherapist, Duration duration,
                          List<Diagnostic_> diagnostics, Status status, Difficulty difficulty) {
        super(rehabilitationId);
        this.user = Objects.requireNonNull(user);
        this.physicalTherapist = Objects.requireNonNull(physicalTherapist);
        this.duration = Objects.requireNonNull(duration);
        this.diagnostics = Objects.requireNonNull(diagnostics);
        this.status = Objects.requireNonNull(status);
        this.difficulty = Objects.requireNonNull(difficulty);
        this.applyChange(new RehabilitationCreated(user, physicalTherapist, duration, diagnostics, status, difficulty));
    }


    public void addUser(UserId userId, FullName fullName, Age age, Diagnostic_ diagnostic, Treatment treatment,
                        Status status) {
        this.applyChange(new UserAdded(userId, fullName, age, diagnostic, treatment, status));
    }

    public void addPhysicalTherapist(PhysicalTherapistId physicalTherapistId, FullName fullName, Treatment treatment,
                                     ExcercisesList excercisesList) {
        this.applyChange(new PhysicalTherapistAdded(physicalTherapistId, fullName, treatment, excercisesList));
    }

    public void setStatus(Status status) {
        this.applyChange(new statusSetted(status));
    }

    public void setDuration(Duration duration) {
        this.applyChange(new DurationSetted(duration));
    }

    public void saveDiagnostic(Diagnostic_ diagnostic) {
        this.applyChange(new DiagnosticSaved(diagnostic));
    }

    public void setDifficulty(Difficulty difficulty) {
        this.applyChange(new DifficultySetted(difficulty));
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
