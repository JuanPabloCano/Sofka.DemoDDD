package co.com.sofka.domain.rehabilitation.commands;

import co.com.sofka.generic.Difficulty;

public class SetDifficulty {

    private final Difficulty difficulty;

    public SetDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }
}
