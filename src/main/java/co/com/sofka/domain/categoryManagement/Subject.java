package co.com.sofka.domain.categoryManagement;

import co.com.sofka.domain.categoryManagement.values.Excercise;
import co.com.sofka.domain.categoryManagement.values.SubjectId;
import co.com.sofka.enum_.Status;
import co.com.sofka.generic.Duration;
import co.com.sofka.generic.Entity;
import co.com.sofka.generic.Sessions;

import java.util.Objects;

public class Subject extends Entity<SubjectId> {

    private Duration duration;
    private Sessions sessions;
    private Excercise excercise;
    private Status status;

    public Subject(SubjectId subjectId, Duration duration, Sessions sessions, Excercise excercise, Status status) {
        super(subjectId);
        this.duration = Objects.requireNonNull(duration);
        this.sessions = Objects.requireNonNull(sessions);
        this.excercise = Objects.requireNonNull(excercise);
        this.status = Objects.requireNonNull(status);
    }

    public void addDuration(Duration duration) {
        this.duration = duration;
    }

    public void addSessionsNumber(Sessions sessions) {
        this.sessions = sessions;
    }

    public void addExcercises(Excercise excercise) {
        this.excercise = excercise;
    }

    public void updateSubjectStatus(Status status) {
        this.status = status;
    }

    public Duration Duration() {
        return duration;
    }

    public Sessions Sessions() {
        return sessions;
    }

    public Excercise Excercise() {
        return excercise;
    }

    public Status Status() {
        return status;
    }
}
