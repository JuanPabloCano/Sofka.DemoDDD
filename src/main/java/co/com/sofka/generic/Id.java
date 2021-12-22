package co.com.sofka.generic;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public abstract class Id implements Serializable {
    private final String value;

    public Id() {
        this(UUID.randomUUID().toString());
    }

    public Id(String value){
        this.value = Objects.requireNonNull(value, "Campo obligatorio");
        if (this.value.isBlank()){
            throw new IllegalArgumentException("El campo no puede estar vacío");
        }
    }

    public String getValue(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Id id = (Id) o;
        return Objects.equals(value, id.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
