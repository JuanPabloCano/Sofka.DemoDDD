package co.com.sofka.domain.academy.values;

import co.com.sofka.generic.Id;

public class TeacherId extends Id {

    private TeacherId(String value) {
        super(value);
    }

    public TeacherId() {
    }

    public static TeacherId of(String value) {
        return new TeacherId(value);
    }

}
