package co.com.sofka.domain.academy.commands;

import co.com.sofka.domain.academy.values.StudentId;
import co.com.sofka.generic.Age;
import co.com.sofka.generic.Email;
import co.com.sofka.generic.FullName;

public class AddStudent {

    private final StudentId studentId;
    private final FullName fullName;
    private final Email email;
    private final Age age;

    public AddStudent(StudentId studentId, FullName fullName, Email email, Age age) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.email = email;
        this.age = age;
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
}
