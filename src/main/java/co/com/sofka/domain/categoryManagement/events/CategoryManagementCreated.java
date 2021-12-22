package co.com.sofka.domain.categoryManagement.events;

import co.com.sofka.domain.categoryManagement.Challenge;
import co.com.sofka.domain.categoryManagement.Subject;
import co.com.sofka.domain.categoryManagement.values.CategoryManagementId;
import co.com.sofka.domain.categoryManagement.values.Name;
import co.com.sofka.enum_.Status;
import co.com.sofka.generic.DomainEvent;
import co.com.sofka.generic.Duration;

public class CategoryManagementCreated extends DomainEvent {

    private final CategoryManagementId categoryManagementId;
    private final Challenge challenge;
    private final Subject subject;
    private final Duration duration;
    private final Status status;
    private final Name name;

    public CategoryManagementCreated(CategoryManagementId categoryManagementId, Challenge challenge, Subject subject, Duration duration, Status status, Name name) {
        super("sofka.categoryManagement.categoryManagementCreated");
        this.categoryManagementId = categoryManagementId;
        this.challenge = challenge;
        this.subject = subject;
        this.duration = duration;
        this.status = status;
        this.name = name;
    }

    public CategoryManagementId CategoryManagementId() {
        return categoryManagementId;
    }

    public Challenge Challenge() {
        return challenge;
    }

    public Subject Subject() {
        return subject;
    }

    public Duration Duration() {
        return duration;
    }

    public Status Status() {
        return status;
    }

    public Name Name() {
        return name;
    }
}
