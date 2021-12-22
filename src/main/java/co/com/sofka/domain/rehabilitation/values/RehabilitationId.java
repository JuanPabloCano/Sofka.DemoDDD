package co.com.sofka.domain.rehabilitation.values;

import co.com.sofka.generic.Id;

public class RehabilitationId extends Id {

    private RehabilitationId(String value) {
        super(value);
    }

    public RehabilitationId() {
    }

    public static RehabilitationId of(String value) {
        return new RehabilitationId(value);
    }

}
