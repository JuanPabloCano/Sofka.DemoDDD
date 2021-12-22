package co.com.sofka.domain.rehabilitation.commands;

import co.com.sofka.enum_.Status;

public class SetStatus {

    private final Status status;

    public SetStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
