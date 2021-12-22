package co.com.sofka.domain.categoryManagement.events;

import co.com.sofka.domain.categoryManagement.values.ChallengeId;
import co.com.sofka.domain.categoryManagement.values.Excercise;
import co.com.sofka.generic.Difficulty;
import co.com.sofka.generic.DomainEvent;
import co.com.sofka.generic.Duration;

import java.util.Date;

public class ChallengeSetted extends DomainEvent {

    private final ChallengeId challengeId;
    private final Excercise excercise;
    private final Duration duration;
    private final Difficulty difficulty;
    private final Date date;

    public ChallengeSetted(ChallengeId challengeId, Excercise excercise, Duration duration, Difficulty difficulty, Date date) {
        super("sofka.categoryManagement.challengeSetted");
        this.challengeId = challengeId;
        this.excercise = excercise;
        this.duration = duration;
        this.difficulty = difficulty;
        this.date = date;
    }

    public ChallengeId ChallengeId() {
        return challengeId;
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

    public Date Date() {
        return date;
    }
}
