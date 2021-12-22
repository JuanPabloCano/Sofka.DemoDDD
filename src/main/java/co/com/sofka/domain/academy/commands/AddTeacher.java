package co.com.sofka.domain.academy.commands;

import co.com.sofka.domain.academy.values.TeacherId;
import co.com.sofka.generic.FullName;
import co.com.sofka.generic.Sessions;

public class AddTeacher {

    private final TeacherId teacherId;
    private final FullName fullName;
    private final Sessions sessions;

    public AddTeacher(TeacherId teacherId, FullName fullName, Sessions sessions) {
        this.teacherId = teacherId;
        this.fullName = fullName;
        this.sessions = sessions;
    }

    public TeacherId getTeacherId() {
        return teacherId;
    }

    public FullName getFullName() {
        return fullName;
    }

    public Sessions getSessions() {
        return sessions;
    }
}
