package co.com.sofka.domain.academy.events;

import co.com.sofka.enum_.Lenguage;
import co.com.sofka.generic.DomainEvent;

public class lenguageSelected extends DomainEvent {

    private final Lenguage lenguage;

    public lenguageSelected(Lenguage lenguage) {
        super("sofka.academy.lenguageSelected");
        this.lenguage = lenguage;
    }

    public Lenguage getLenguage() {
        return lenguage;
    }
}
