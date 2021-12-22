package co.com.sofka.domain.categoryManagement;

import co.com.sofka.domain.categoryManagement.values.ChallengeId;
import co.com.sofka.domain.categoryManagement.values.Excercise;
import co.com.sofka.enum_.Status;
import co.com.sofka.generic.Difficulty;
import co.com.sofka.generic.Duration;
import co.com.sofka.generic.Entity;

import java.util.Date;
import java.util.Objects;

public class Challenge extends Entity<ChallengeId> {

    private Excercise excercise;
    private Duration duration;
    private Difficulty difficulty;
    private Status status;
    private Date date;

    public Challenge(ChallengeId challengeId, Excercise excercise, Duration duration, Difficulty difficulty,
                     Status status, Date date) {
        super(challengeId);
        this.excercise = Objects.requireNonNull(excercise);
        this.duration = Objects.requireNonNull(duration);
        this.difficulty = Objects.requireNonNull(difficulty);
        this.status = Objects.requireNonNull(status);
        this.date = Objects.requireNonNull(date);
    }

    public void addExcercise(Excercise excercise) {
        this.excercise = excercise;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Excercise Excercise() {
        return excercise;
    }

    public Duration Duration() {
        return duration;
    }

    public Difficulty Difficulty() {
        return difficulty;
    }

    public Status Status() {
        return status;
    }

    public Date Date() {
        return date;
    }
}
