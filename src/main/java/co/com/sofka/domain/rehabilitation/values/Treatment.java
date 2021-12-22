package co.com.sofka.domain.rehabilitation.values;

import java.io.Serializable;
import java.util.Objects;

public class Treatment implements Serializable {

    private final String exercise;
    private final String objective;
    private final Integer treatmentDuration;


    public Treatment(String exercise, String objective, Integer treatmentDuration) {
        this.exercise = Objects.requireNonNull(exercise, "El ejercicio es requerido");
        this.objective = Objects.requireNonNull(objective, "El objetivo es requerido");
        this.treatmentDuration = Objects.requireNonNull(treatmentDuration, "La duración del tratamiento es requerida");

        if (this.exercise.isBlank()){
            throw new IllegalArgumentException("El ejercicio no puede estar en blanco");
        }
        if (this.objective.isBlank()){
            throw new IllegalArgumentException("El objetivo no puede estar en blanco");
        }
        if (this.treatmentDuration <= 0 || this.treatmentDuration > 90){
            throw new IllegalArgumentException("La duración del tratamiento no puede ser igual o menor que cero ni " +
                    "superior a 90 minutos");
        }
    }

    public String getExercise() {
        return exercise;
    }

    public String getObjective() {
        return objective;
    }

    public Integer getTreatmentDuration() {
        return treatmentDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treatment treatment = (Treatment) o;
        return Objects.equals(exercise, treatment.exercise) && Objects.equals(objective, treatment.objective) && Objects.equals(treatmentDuration, treatment.treatmentDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exercise, objective, treatmentDuration);
    }
}
