package co.com.sofka.generic;

import java.io.Serializable;
import java.util.Objects;

public class FullName implements Serializable {

    private final String name;


    public FullName(String name) {
        this.name = Objects.requireNonNull(name, "El nombre es requerido");
        if (this.name.isBlank()) {
            throw new IllegalArgumentException("EL nombre no puede estar vacío");
        }
        if (this.name.length() <= 0 || this.name.length() > 100){
            throw new IllegalArgumentException("El nombre no puede ser menor o igual que cero ni mayor a 100 " +
                    "caracteres");
        }

    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullName fullName = (FullName) o;
        return Objects.equals(name, fullName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
