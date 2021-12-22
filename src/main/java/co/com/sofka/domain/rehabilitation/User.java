package co.com.sofka.domain.rehabilitation;

import co.com.sofka.enum_.Status;
import co.com.sofka.domain.rehabilitation.values.Diagnostic_;
import co.com.sofka.domain.rehabilitation.values.Treatment;
import co.com.sofka.domain.rehabilitation.values.UserId;
import co.com.sofka.generic.Age;
import co.com.sofka.generic.Entity;
import co.com.sofka.generic.FullName;

import java.util.Objects;

public class User extends Entity<UserId> {

    private FullName fullName;
    private Age age;
    private Diagnostic_ diagnostic;
    private Treatment treatment;
    private Status status;

    public User(UserId userId, FullName fullName, Age age, Diagnostic_ diagnostic, Treatment treatment,
                Status status) {
        super(userId);
        this.fullName = Objects.requireNonNull(fullName);
        this.age = Objects.requireNonNull(age);
        this.diagnostic = Objects.requireNonNull(diagnostic);
        this.treatment = Objects.requireNonNull(treatment);
        this.status = Objects.requireNonNull(status);
    }

    public FullName FullName() {
        return fullName;
    }

    public void addFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public Age Age() {
        return age;
    }

    public void addAge(Age age) {
        this.age = age;
    }

    public Diagnostic_ Diagnostic() {
        return diagnostic;
    }

    public void addDiagnostic(Diagnostic_ diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Treatment Treatment() {
        return treatment;
    }

    public void selectTreatmentSchedule(Treatment treatment) {
        this.treatment = treatment;
    }

    public Status Status() {
        return status;
    }

    public void updateStatus(Status status) {
        this.status = status;
    }
}
