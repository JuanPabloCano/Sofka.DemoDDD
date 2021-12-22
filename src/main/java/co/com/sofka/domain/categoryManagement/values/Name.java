package co.com.sofka.domain.categoryManagement.values;

import java.io.Serializable;
import java.util.Objects;

public class Name implements Serializable {

    private final String name;

    public Name(String name) {
        this.name = Objects.requireNonNull(name, "El nombre es requerido");

        if (this.name.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
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
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
