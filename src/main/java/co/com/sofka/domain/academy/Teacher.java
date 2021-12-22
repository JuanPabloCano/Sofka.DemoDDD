package co.com.sofka.domain.academy;

import co.com.sofka.domain.academy.values.*;
import co.com.sofka.generic.Entity;
import co.com.sofka.generic.FullName;
import co.com.sofka.generic.Sessions;

import java.util.Objects;

public class Teacher extends Entity<TeacherId> {

    private FullName fullName;
    private Grade grade;
    private Sessions sessions;

    public Teacher(TeacherId id, FullName fullName, Grade grade, Sessions sessions) {
        super(id);
        this.fullName = Objects.requireNonNull(fullName, "El nombre es requerido");
        this.grade = Objects.requireNonNull(grade, "La nota es requerida");
        this.sessions = Objects.requireNonNull(sessions, "Las sesiones son requeridas");
    }

    public FullName FullName() {
        return fullName;
    }

    public Grade Grade() {
        return grade;
    }

    public Sessions Sessions() {
        return sessions;
    }

    public void upgradeStudentGrade(Grade grade) {
        this.grade = grade;
    }

    public void addFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public void setSessionsSchedule(Sessions sessions) {
        this.sessions = sessions;
    }
}
