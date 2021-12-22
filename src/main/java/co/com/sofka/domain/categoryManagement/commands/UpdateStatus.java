package co.com.sofka.domain.categoryManagement.commands;

import co.com.sofka.enum_.Status;

public class UpdateStatus {

    private final Status status;

    public UpdateStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}

