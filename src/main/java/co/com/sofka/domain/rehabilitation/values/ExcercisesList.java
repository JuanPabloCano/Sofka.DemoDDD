package co.com.sofka.domain.rehabilitation.values;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExcercisesList implements Serializable {

    private final List<ExcercisesList> excercisesList;


    public ExcercisesList(List<ExcercisesList> excercisesList) {
        this.excercisesList = new ArrayList<>();

        if (this.excercisesList.isEmpty()){
            throw new IllegalArgumentException("La lista de ejercicios no puede estar vacía");
        }
    }

    public void addExercises(List<ExcercisesList> excercisesList){
        var exercises = new ExcercisesList(excercisesList);
        this.excercisesList.add(exercises);
    }

    public List<ExcercisesList> getExcercisesList() {
        return excercisesList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExcercisesList that = (ExcercisesList) o;
        return Objects.equals(excercisesList, that.excercisesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(excercisesList);
    }
}
