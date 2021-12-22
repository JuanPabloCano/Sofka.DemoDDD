package co.com.sofka.domain.categoryManagement.commands;

import co.com.sofka.domain.categoryManagement.values.Name;

public class AddSubjectName {

    private final Name name;

    public AddSubjectName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
