package co.com.sofka.domain.categoryManagement;

import co.com.sofka.domain.categoryManagement.events.*;
import co.com.sofka.domain.categoryManagement.values.CategoryManagementId;
import co.com.sofka.domain.categoryManagement.values.ChallengeId;
import co.com.sofka.domain.categoryManagement.values.Excercise;
import co.com.sofka.domain.categoryManagement.values.Name;
import co.com.sofka.enum_.Status;
import co.com.sofka.generic.*;

import java.util.Date;
import java.util.Objects;


public class CategoryManagement extends AggregateRoot<CategoryManagementId> {

    // Entities
    private Challenge challenge;
    private Subject subject;

    // Value objects
    private final Duration duration;
    private final Status status;
    private final Name name;

    public CategoryManagement(CategoryManagementId categoryManagementId, Challenge challenge, Subject subject,
                              Duration duration, Status status,
                              Name name) {
        super(categoryManagementId);
        this.challenge = Objects.requireNonNull(challenge);
        this.subject = Objects.requireNonNull(subject);
        this.duration = Objects.requireNonNull(duration);
        this.status = Objects.requireNonNull(status);
        this.name = Objects.requireNonNull(name);
        this.applyChange(new CategoryManagementCreated(categoryManagementId, challenge, subject, duration, status, name));
    }

    public void subscribeSubject(Duration duration, Sessions sessions, Excercise excercise, Status status) {
        this.applyChange(new SubjectSubscribed(duration, sessions, excercise, status));
    }

    public void setDuration(Duration duration) {
        this.applyChange(new DurationSetted(duration));
    }

    public void updateStatus(Status status) {
        this.applyChange(new StatusUpdated(status));
    }

    public void addSubjectName(Name name) {
        this.applyChange(new SubjectNameAdded(name));
    }

    public void changeDuration(Duration duration) {
        this.applyChange(new DurationChanged(duration));
    }

    public void setChallenge(ChallengeId challengeId, Excercise excercise, Duration duration, Difficulty difficulty,
                             Date date) {
        this.applyChange(new ChallengeSetted(challengeId, excercise, duration, difficulty, date));
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
