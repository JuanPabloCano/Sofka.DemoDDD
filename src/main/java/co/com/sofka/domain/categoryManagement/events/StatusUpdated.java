package co.com.sofka.domain.categoryManagement.events;

import co.com.sofka.enum_.Status;
import co.com.sofka.generic.DomainEvent;

public class StatusUpdated extends DomainEvent {

    private final Status status;

    public StatusUpdated(Status status) {
        super("sofka.categoryManagement.statusUpdated");
        this.status = status;
    }

    public Status Status() {
        return status;
    }
}
