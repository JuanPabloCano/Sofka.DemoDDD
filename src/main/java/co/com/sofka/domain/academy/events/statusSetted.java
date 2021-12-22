package co.com.sofka.domain.academy.events;

import co.com.sofka.enum_.Status;
import co.com.sofka.generic.DomainEvent;

public class statusSetted extends DomainEvent {

    private final Status status;

    public statusSetted(Status status) {
        super("sofka.academy.statusSetted");
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
