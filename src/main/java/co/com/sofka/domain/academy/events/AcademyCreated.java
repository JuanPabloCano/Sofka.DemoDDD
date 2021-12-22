package co.com.sofka.domain.academy.events;

import co.com.sofka.domain.academy.Student;
import co.com.sofka.domain.academy.Teacher;
import co.com.sofka.enum_.Lenguage;
import co.com.sofka.enum_.Status;
import co.com.sofka.generic.DomainEvent;

public class AcademyCreated extends DomainEvent {

    private final Teacher teacher;
    private final Student student;
    private final Enum<Lenguage> lenguage;
    private final Enum<Status> status;

    public AcademyCreated(Teacher teacher, Student student, Enum<Lenguage> lenguage, Enum<Status> status) {
        super("sofka.academy.academyCreated");
        this.teacher = teacher;
        this.student = student;
        this.lenguage = lenguage;
        this.status = status;
    }

    public Teacher Teacher() {
        return teacher;
    }

    public Student Student() {
        return student;
    }

    public Enum<Lenguage> Lenguage() {
        return lenguage;
    }

    public Enum<Status> Status() {
        return status;
    }
}
