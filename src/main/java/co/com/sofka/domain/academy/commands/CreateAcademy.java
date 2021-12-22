package co.com.sofka.domain.academy.commands;

import co.com.sofka.domain.academy.Student;
import co.com.sofka.domain.academy.Teacher;
import co.com.sofka.domain.academy.values.AcademyId;
import co.com.sofka.enum_.Lenguage;
import co.com.sofka.enum_.Status;

public class CreateAcademy {

    private final AcademyId academyId;
    private final Teacher teacher;
    private final Student student;
    private final Lenguage lenguage;
    private final Status status;

    public CreateAcademy(AcademyId academyId, Teacher teacher, Student student, Lenguage lenguage, Status status) {
        this.academyId = academyId;
        this.teacher = teacher;
        this.student = student;
        this.lenguage = lenguage;
        this.status = status;
    }

    public AcademyId getAcademyId() {
        return academyId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student getStudent() {
        return student;
    }

    public Lenguage getLenguage() {
        return lenguage;
    }

    public Status getStatus() {
        return status;
    }
}
