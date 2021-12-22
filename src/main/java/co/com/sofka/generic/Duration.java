package co.com.sofka.generic;

import java.io.Serializable;
import java.util.Objects;

public class Duration implements Serializable {
    private final Integer duration;

    public Duration(Integer duration) {
        this.duration = Objects.requireNonNull(duration, "La duración es requerida");

        if (this.duration < 15){
            throw new IllegalArgumentException("La duración no puede ser menor que 15");
        }
    }

    public Integer getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duration duration1 = (Duration) o;
        return Objects.equals(duration, duration1.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration);
    }
}
