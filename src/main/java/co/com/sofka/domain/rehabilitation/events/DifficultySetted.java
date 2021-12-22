package co.com.sofka.domain.rehabilitation.events;

import co.com.sofka.generic.Difficulty;
import co.com.sofka.generic.DomainEvent;

public class DifficultySetted extends DomainEvent {

    private final Difficulty difficulty;

    public DifficultySetted(Difficulty difficulty) {
        super("sofka.rehabilitation.difficultySetted");
        this.difficulty = difficulty;
    }

    public Difficulty Difficulty() {
        return difficulty;
    }
}
