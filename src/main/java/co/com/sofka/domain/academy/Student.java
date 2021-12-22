package co.com.sofka.domain.academy;

import co.com.sofka.domain.academy.values.*;
import co.com.sofka.generic.*;

import java.util.Objects;

public class Student extends Entity<StudentId> {

    private FullName fullName;
    private Email email;
    private Age age;
    private Grade grade;
    private Practice practice;
    private Sessions sessions;


    public Student(StudentId studentId, FullName fullName, Email email, Age age, Grade grade, Practice practice,
                   Sessions sessions) {
        super(studentId);
        this.fullName = Objects.requireNonNull(fullName, "El nombre es requerido");
        this.email = Objects.requireNonNull(email, "El email es requerido");
        this.age = Objects.requireNonNull(age, "La edad es requerida");
        this.grade = Objects.requireNonNull(grade, "La nota es requerida");
        this.practice = Objects.requireNonNull(practice, "La práctica es requerida");
        this.sessions = Objects.requireNonNull(sessions, "Las sesiones son requeridas");
    }

    public void addFullName(FullName fullName) {
        this.fullName = Objects.requireNonNull(fullName);
    }

    public void addEmail(Email email) {
        this.email = Objects.requireNonNull(email);
    }

    public void addAge(Age age) {
        this.age = Objects.requireNonNull(age);
    }

    public void addGrade(Grade grade) {
        this.grade = Objects.requireNonNull(grade);
    }

    public void addPractice(Practice practice) {
        this.practice = Objects.requireNonNull(practice);
    }

    public void addSessionsSchedule(Sessions sessions) {
        this.sessions = Objects.requireNonNull(sessions);
    }

    public FullName FullName() {
        return fullName;
    }

    public Email Email() {
        return email;
    }

    public Age Age() {
        return age;
    }

    public Grade Grade() {
        return grade;
    }

    public Practice Practice() {
        return practice;
    }

    public Sessions Sessions() {
        return sessions;
    }
}
