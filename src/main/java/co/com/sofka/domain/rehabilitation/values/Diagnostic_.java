package co.com.sofka.domain.rehabilitation.values;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public class Diagnostic_ implements Serializable {

    private final Date date;
    private final String injuryType;
    private final String injury;
    private final String injuryDescription;

    public Diagnostic_(Date date, String injuryType, String injury, String injuryDescription) {
        this.date = Objects.requireNonNull(date, "La fecha es requerida");
        this.injuryType = Objects.requireNonNull(injuryType, "El tipo de lesión es requerido");
        this.injury = Objects.requireNonNull(injury, "La lesión es requerida");
        this.injuryDescription = Objects.requireNonNull(injuryDescription, "La descripción de la lesión es requerida");

        if (this.date.after(new Date(Instant.now().toEpochMilli()))) {
            throw new IllegalArgumentException("La fecha no puede estar en pasado");
        }

        if (isValueBlank(this.injuryType)) {
            throw new IllegalArgumentException("El tipo de lesión no puede estar vacío");
        }
        if (isValueBlank(this.injury)) {
            throw new IllegalArgumentException("La lesión no puede estar vacía");
        }
        if (isValueBlank(this.injuryDescription)) {
            throw new IllegalArgumentException("La descripción de la lesión no puede estar en pasado");
        }
        if (injuryDescriptionLowerThanZeroOrGreaterThanOneHundred()) {
            throw new IllegalArgumentException("La descripción de la lesión no puede tener una longitud negativa, " +
                    "igual a cero o mayor de 100 caracteres");
        }
    }

    private boolean isValueBlank(String p) {
        return p.isBlank();
    }

    private boolean injuryDescriptionLowerThanZeroOrGreaterThanOneHundred() {
        return this.injuryDescription.length() <= 0 || this.injuryDescription.length() >= 100;
    }


    public Date getDate() {
        return date;
    }

    public String getInjuryType() {
        return injuryType;
    }

    public String getInjury() {
        return injury;
    }

    public String getInjuryDescription() {
        return injuryDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Diagnostic_ that = (Diagnostic_) o;
        return Objects.equals(date, that.date) && Objects.equals(injuryType, that.injuryType) && Objects.equals(injury,
                that.injury) && Objects.equals(injuryDescription, that.injuryDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, injuryType, injury, injuryDescription);
    }
}
