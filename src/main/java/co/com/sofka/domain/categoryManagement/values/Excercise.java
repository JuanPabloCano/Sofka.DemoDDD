package co.com.sofka.domain.categoryManagement.values;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Excercise implements Serializable {

    private final Integer amount;
    private final List<String> type;
    private final String field;

    public Excercise(Integer amount, List<String> type, String field) {
        this.amount = Objects.requireNonNull(amount, "La cantidad es requerida");
        this.type = Objects.requireNonNull(type, "El tipo es requerido");
        this.field = Objects.requireNonNull(field, "El campo es requerido");

        if (this.amount.equals(0)){
            throw new IllegalArgumentException("La cantidad no puede ser cero");
        }
        if (this.type.isEmpty()){
            throw new IllegalArgumentException("La lista de tipos no puede estar vacía");
        }
        if (this.field.isBlank()){
            throw new IllegalArgumentException("El campo no puede estar vacío");
        }
    }

    public Integer getAmount() {
        return amount;
    }

    public List<String> getType() {
        return type;
    }

    public String getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Excercise excercise = (Excercise) o;
        return Objects.equals(amount, excercise.amount) && Objects.equals(type, excercise.type) && Objects.equals(field, excercise.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, type, field);
    }
}
