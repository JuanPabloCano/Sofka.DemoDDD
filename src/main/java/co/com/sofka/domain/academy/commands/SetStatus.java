package co.com.sofka.domain.academy.commands;

import co.com.sofka.enum_.Status;

public class SetStatus {

    private final Enum<Status> status;

    public SetStatus(Enum<Status> status) {
        this.status = status;
    }

    public Enum<Status> getStatus() {
        return status;
    }
}
