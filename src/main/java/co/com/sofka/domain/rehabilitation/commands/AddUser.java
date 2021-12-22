package co.com.sofka.domain.rehabilitation.commands;

import co.com.sofka.enum_.Status;
import co.com.sofka.domain.rehabilitation.values.Diagnostic_;
import co.com.sofka.domain.rehabilitation.values.Treatment;
import co.com.sofka.domain.rehabilitation.values.UserId;
import co.com.sofka.generic.Age;
import co.com.sofka.generic.FullName;

public class AddUser {

    private final UserId userId;
    private final FullName fullName;
    private final Age age;
    private final Diagnostic_ diagnostic;
    private final Treatment treatment;
    private final Status status;

    public AddUser(UserId userId, FullName fullName, Age age, Diagnostic_ diagnostic, Treatment treatment, Status status) {
        this.userId = userId;
        this.fullName = fullName;
        this.age = age;
        this.diagnostic = diagnostic;
        this.treatment = treatment;
        this.status = status;
    }

    public UserId getUserId() {
        return userId;
    }

    public FullName getFullName() {
        return fullName;
    }

    public Age getAge() {
        return age;
    }

    public Diagnostic_ getDiagnostic() {
        return diagnostic;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public Status getStatus() {
        return status;
    }
}
