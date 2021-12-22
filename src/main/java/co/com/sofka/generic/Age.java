package co.com.sofka.generic;

import java.io.Serializable;
import java.util.Objects;

public class Age implements Serializable {

    private final Integer age;

    public Age(Integer age) {
        this.age = Objects.requireNonNull(age, "La edad es requerida");
        if (this.age <= 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa o igual a cero");
        }
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Age age1 = (Age) o;
        return Objects.equals(age, age1.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
