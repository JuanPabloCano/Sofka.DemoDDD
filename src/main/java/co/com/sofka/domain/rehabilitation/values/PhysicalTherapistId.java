package co.com.sofka.domain.rehabilitation.values;

import co.com.sofka.generic.Id;

public class PhysicalTherapistId extends Id {

    private PhysicalTherapistId(String value) {
        super(value);
    }

    public PhysicalTherapistId() {
    }

    public static PhysicalTherapistId of(String value) {
        return new PhysicalTherapistId(value);
    }

}
