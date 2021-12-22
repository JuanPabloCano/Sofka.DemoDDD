package co.com.sofka.generic;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public class Sessions implements Serializable {
    private final Date date;
    private final String field;

    public Sessions(Date date, String field) {
        this.date = Objects.requireNonNull(date, "La fecha es requerida");
        this.field = Objects.requireNonNull(field, "El campo es requerido");

        if (this.date.before(new Date(Instant.now().toEpochMilli()))) {
            throw new IllegalArgumentException("La fecha no puede estar en pasado");
        }
        if (this.field.isBlank()) {
            throw new IllegalArgumentException("El campo no puede estar vacío");
        }
    }

    public Date getDate() {
        return date;
    }

    public String getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sessions sessions = (Sessions) o;
        return Objects.equals(date, sessions.date) && Objects.equals(field, sessions.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, field);
    }
}
