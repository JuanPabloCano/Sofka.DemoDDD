package co.com.sofka.domain.categoryManagement.commands;

import co.com.sofka.domain.categoryManagement.values.Excercise;
import co.com.sofka.enum_.Status;
import co.com.sofka.generic.Difficulty;
import co.com.sofka.generic.Duration;
import java.util.Date;

public class SetChallenge {

    private final Excercise excercise;
    private final Duration duration;
    private final Difficulty difficulty;
    private final Status status;
    private final Date date;

    public SetChallenge(Excercise excercise, Duration duration, Difficulty difficulty, Status status, Date date) {
        this.excercise = excercise;
        this.duration = duration;
        this.difficulty = difficulty;
        this.status = status;
        this.date = date;
    }

    public Excercise getExcercise() {
        return excercise;
    }

    public Duration getDuration() {
        return duration;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public Status getStatus() {
        return status;
    }

    public Date getDate() {
        return date;
    }
}
