package co.com.sofka.domain.academy.values;

import co.com.sofka.generic.Id;

public class AcademyId extends Id {

    private AcademyId(String value) {
        super(value);
    }

    public AcademyId() {
    }

    public static AcademyId of(String value) {
        return new AcademyId(value);
    }

}
