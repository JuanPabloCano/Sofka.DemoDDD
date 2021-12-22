package co.com.sofka.domain.academy.values;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public final class Practice implements Serializable {

    private final String name;
    private final List<String> exerciseList;
    private final String branch;


    public Practice(String name, List<String> exerciseList, String branch) {
        this.name = nonNullName(name, "El nombre es requerido");
        this.exerciseList = Objects.requireNonNull(exerciseList, "La lista de ejercicios es requerida");
        this.branch = nonNullName(branch, "La rama es requerida");

        if (isNameBlank(this.name)) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (isExerciseListEmpty(this.exerciseList)) {
            throw new IllegalArgumentException("La lista de ejercicios no puede estar vacía");
        }
        if (isNameBlank(this.branch)) {
            throw new IllegalArgumentException("La rama no puede estar vacía");
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getExerciseList() {
        return exerciseList;
    }

    public String getBranch() {
        return branch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Practice practice = (Practice) o;
        return name.equals(practice.name) && exerciseList.equals(practice.exerciseList) && branch.equals(practice.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, exerciseList, branch);
    }

    private boolean isExerciseListEmpty(List<String> exerciseList) {
        return exerciseList.isEmpty();
    }

    private boolean isNameBlank(String p) {
        return p.isBlank();
    }

    private String nonNullName(String name, String s) {
        return Objects.requireNonNull(name, s);
    }

    public String name() {
        return name;
    }

    public List<String> exerciseList() {
        return exerciseList;
    }

    public String branch() {
        return branch;
    }

    @Override
    public String toString() {
        return "Practice[" +
                "name=" + name + ", " +
                "exerciseList=" + exerciseList + ", " +
                "branch=" + branch + ']';
    }


}
