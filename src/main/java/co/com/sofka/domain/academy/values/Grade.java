package co.com.sofka.domain.academy.values;

import java.io.Serializable;
import java.util.Objects;

public class Grade implements Serializable {
    private final Double grade;

    public Grade(Double grade) {
        this.grade = Objects.requireNonNull(grade, "La nota es requerida");
        if (this.grade < 0) {
            throw new IllegalArgumentException("La nota no puede ser negativa");
        }
    }

    public Double getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade1 = (Grade) o;
        return Objects.equals(grade, grade1.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grade);
    }
}
