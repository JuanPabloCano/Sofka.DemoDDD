package co.com.sofka.generic;

import java.io.Serializable;
import java.util.Objects;

public class Difficulty implements Serializable {
    private final Double exerciseDifficulty;

    public Difficulty(Double exerciseDifficulty) {
        this.exerciseDifficulty = Objects.requireNonNull(exerciseDifficulty, "La dificultad del ejercicio es " +
                "requerida");

        if (this.exerciseDifficulty.isNaN()){
            throw new IllegalArgumentException("La dificultad del ejercicio no puede estar vacía");
        }
        if (this.exerciseDifficulty == 0 || this.exerciseDifficulty > 10){
            throw new IllegalArgumentException("La dificultad del ejercicio no puede ser igual que cero ni mayor a 10");
        }
    }

    public Double getExerciseDifficulty() {
        return exerciseDifficulty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Difficulty that = (Difficulty) o;
        return Objects.equals(exerciseDifficulty, that.exerciseDifficulty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exerciseDifficulty);
    }
}
