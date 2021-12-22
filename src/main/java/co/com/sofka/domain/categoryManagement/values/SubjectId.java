package co.com.sofka.domain.categoryManagement.values;

import co.com.sofka.generic.Id;

public class SubjectId extends Id {

    private SubjectId(String value) {
        super(value);
    }

    public SubjectId() {
    }

    public static SubjectId of(String value) {
        return new SubjectId(value);
    }

}
