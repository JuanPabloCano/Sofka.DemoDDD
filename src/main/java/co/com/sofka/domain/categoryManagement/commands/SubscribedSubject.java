package co.com.sofka.domain.categoryManagement.commands;

import co.com.sofka.domain.categoryManagement.values.Excercise;
import co.com.sofka.domain.categoryManagement.values.SubjectId;
import co.com.sofka.generic.FullName;
import co.com.sofka.generic.Sessions;

public class SubscribedSubject {

    private final SubjectId subjectId;
    private final FullName fullName;
    private final Sessions sessions;
    private final Excercise excercise;

    public SubscribedSubject(SubjectId subjectId, FullName fullName, Sessions sessions, Excercise excercise) {
        this.subjectId = subjectId;
        this.fullName = fullName;
        this.sessions = sessions;
        this.excercise = excercise;
    }

    public SubjectId getSubjectId() {
        return subjectId;
    }

    public FullName getFullName() {
        return fullName;
    }

    public Sessions getSessions() {
        return sessions;
    }

    public Excercise getExcercise() {
        return excercise;
    }
}
