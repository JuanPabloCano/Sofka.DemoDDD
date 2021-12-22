package co.com.sofka.domain.academy;

import co.com.sofka.domain.academy.events.*;
import co.com.sofka.domain.academy.values.*;
import co.com.sofka.enum_.Lenguage;
import co.com.sofka.enum_.Status;
import co.com.sofka.generic.*;

import java.util.Objects;

public class Academy extends AggregateRoot<AcademyId> {

    // Entities
    private final Teacher teacher;
    private final Student student;

    // Value objects
    private final Lenguage lenguage;
    private final Status status;


    public Academy(AcademyId academyId, Teacher teacher, Student student, Lenguage lenguage, Status status) {
        super(academyId);
        this.teacher = Objects.requireNonNull(teacher);
        this.student = Objects.requireNonNull(student);
        this.lenguage = Objects.requireNonNull(lenguage);
        this.status = Objects.requireNonNull(status);
        this.applyChange(new AcademyCreated(teacher, student, lenguage, status));
    }

    public void addTeacher(TeacherId teacherId, FullName fullName, Grade grade, Sessions sessions ){
        this.applyChange(new TeacherAdded(teacherId, fullName, grade, sessions));
    }

    public void addStudent(StudentId studentId, FullName fullName, Email email, Age age, Grade grade, Practice practice,
                           Sessions sessions){
        this.applyChange(new StudentAdded(studentId, fullName, email, age, grade, practice, sessions));
    }

    public void setStatus(Status status){
        this.applyChange(new statusSetted(status));
    }

    public void setLenguage(Lenguage lenguage){
        this.applyChange(new lenguageSelected(lenguage));
    }

    public Teacher Teacher() {
        return teacher;
    }

    public Student Student() {
        return student;
    }

    public Lenguage Lenguage() {
        return lenguage;
    }

    public Status Status() {
        return status;
    }
}
