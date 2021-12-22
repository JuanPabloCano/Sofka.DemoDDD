package co.com.sofka.domain.rehabilitation.events;

import co.com.sofka.enum_.Status;
import co.com.sofka.domain.rehabilitation.values.Diagnostic_;
import co.com.sofka.domain.rehabilitation.values.Treatment;
import co.com.sofka.domain.rehabilitation.values.UserId;
import co.com.sofka.generic.Age;
import co.com.sofka.generic.DomainEvent;
import co.com.sofka.generic.FullName;

public class UserAdded extends DomainEvent {


    private final UserId userId;
    private final FullName fullName;
    private final Age age;
    private final Diagnostic_ diagnostic;
    private final Treatment treatment;
    private final Status status;

    public UserAdded(UserId userId, FullName fullName, Age age, Diagnostic_ diagnostic, Treatment treatment, Status status) {
        super("sofka.rehabilitation.userAdded");
        this.userId = userId;
        this.fullName = fullName;
        this.age = age;
        this.diagnostic = diagnostic;
        this.treatment = treatment;
        this.status = status;
    }

    public UserId UserId() {
        return userId;
    }

    public FullName FullName() {
        return fullName;
    }

    public Age Age() {
        return age;
    }

    public Diagnostic_ Diagnostic() {
        return diagnostic;
    }

    public Treatment Treatment() {
        return treatment;
    }

    public Status Status() {
        return status;
    }
}
