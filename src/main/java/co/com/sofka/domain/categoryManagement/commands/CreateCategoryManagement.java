package co.com.sofka.domain.categoryManagement.commands;


import co.com.sofka.domain.categoryManagement.Challenge;
import co.com.sofka.domain.categoryManagement.Subject;
import co.com.sofka.domain.categoryManagement.values.CategoryManagementId;
import co.com.sofka.domain.categoryManagement.values.Name;
import co.com.sofka.enum_.Status;
import co.com.sofka.generic.Duration;

public class CreateCategoryManagement {
    private final CategoryManagementId categoryManagementId;
    private final Challenge challenge;
    private final Subject subject;
    private final Duration duration;
    private final Status status;
    private final Name name;

    public CreateCategoryManagement(CategoryManagementId categoryManagementId, Challenge challenge, Subject subject, Duration duration, Status status, Name name) {
        this.categoryManagementId = categoryManagementId;
        this.challenge = challenge;
        this.subject = subject;
        this.duration = duration;
        this.status = status;
        this.name = name;
    }

    public CategoryManagementId getCategoryManagementId() {
        return categoryManagementId;
    }

    public Challenge getChallenge() {
        return challenge;
    }

    public Subject getSubject() {
        return subject;
    }

    public Duration getDuration() {
        return duration;
    }

    public Status getStatus() {
        return status;
    }

    public Name getName() {
        return name;
    }
}
