package co.com.sofka.domain.categoryManagement.events;

import co.com.sofka.domain.categoryManagement.values.Excercise;
import co.com.sofka.enum_.Status;
import co.com.sofka.generic.DomainEvent;
import co.com.sofka.generic.Duration;
import co.com.sofka.generic.Sessions;

public class SubjectSubscribed extends DomainEvent {

    private final Duration duration;
    private final Sessions sessions;
    private final Excercise excercise;
    private final Status status;

    public SubjectSubscribed(Duration duration, Sessions sessions, Excercise excercise, Status status) {
        super("sofka.categoryManagement.subjectSubscribed");
        this.duration = duration;
        this.sessions = sessions;
        this.excercise = excercise;
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
