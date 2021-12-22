package co.com.sofka.domain.academy.events;

import co.com.sofka.domain.academy.values.*;
import co.com.sofka.generic.*;

public class StudentAdded extends DomainEvent {
    private final StudentId studentId;
    private final FullName fullName;
    private final Email email;
    private final Age age;
    private final Grade grade;
    private final Practice practice;
    private final Sessions sessions;

    public StudentAdded(StudentId studentId, FullName fullName, Email email, Age age, Grade grade, Practice practice, Sessions sessions) {
        super("sofka.academy.studentAdded");
        this.studentId = studentId;
        this.fullName = fullName;
        this.email = email;
        this.age = age;
        this.grade = grade;
        this.practice = practice;
        this.sessions = sessions;
    }

    public StudentId getStudentId() {
        return studentId;
    }

    public FullName getFullName() {
        return fullName;
    }

    public Email getEmail() {
        return email;
    }

    public Age getAge() {
        return age;
    }

    public Grade getGrade() {
        return grade;
    }

    public Practice getPractice() {
        return practice;
    }

    public Sessions getSessions() {
        return sessions;
    }
}
