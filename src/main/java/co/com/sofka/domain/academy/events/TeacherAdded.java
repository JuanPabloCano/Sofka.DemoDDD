package co.com.sofka.domain.academy.events;

import co.com.sofka.generic.FullName;
import co.com.sofka.domain.academy.values.Grade;
import co.com.sofka.generic.Sessions;
import co.com.sofka.domain.academy.values.TeacherId;
import co.com.sofka.generic.DomainEvent;

public class TeacherAdded extends DomainEvent {

    private final TeacherId teacherId;
    private final FullName fullName;
    private final Grade grade;
    private final Sessions sessions;

    public TeacherAdded(TeacherId teacherId, FullName fullName, Grade grade, Sessions sessions) {
        super("sofka.academy.teacherAdded");
        this.teacherId = teacherId;
        this.fullName = fullName;
        this.grade = grade;
        this.sessions = sessions;
    }

    public TeacherId getTeacherId() {
        return teacherId;
    }

    public FullName getFullName() {
        return fullName;
    }

    public Grade getGrade() {
        return grade;
    }

    public Sessions getSessions() {
        return sessions;
    }
}
