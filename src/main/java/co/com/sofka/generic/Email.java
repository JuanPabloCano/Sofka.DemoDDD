package co.com.sofka.generic;

import java.io.Serializable;
import java.util.Objects;

public class Email implements Serializable
{
    private final String email;

    public Email(String email) {
        this.email = Objects.requireNonNull(email, "El email es requerido");
        if (this.email.isBlank()) {
            throw new IllegalArgumentException("EL email no puede estar vacío");
        }
        if (this.email.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\" +
                ".[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$")) {
            throw new IllegalArgumentException("El email no es válido");
        }
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email1 = (Email) o;
        return Objects.equals(email, email1.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

}
