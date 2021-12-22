package co.com.sofka.domain.categoryManagement.events;

import co.com.sofka.domain.categoryManagement.values.Name;
import co.com.sofka.generic.DomainEvent;

public class SubjectNameAdded extends DomainEvent {

    private final Name name;

    public SubjectNameAdded(Name name) {
        super("sofka.categoryManagement.subjectNameAdded");
        this.name = name;
    }

    public Name Name() {
        return name;
    }
}
