package co.com.sofka.domain.academy.commands;

import co.com.sofka.enum_.Lenguage;

public class SelectLenguage {

    private final Enum<Lenguage> lenguage;

    public SelectLenguage(Enum<Lenguage> lenguage) {
        this.lenguage = lenguage;
    }

    public Enum<Lenguage> getLenguage() {
        return lenguage;
    }
}
