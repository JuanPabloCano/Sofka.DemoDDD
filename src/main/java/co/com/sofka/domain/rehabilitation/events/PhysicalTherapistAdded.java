package co.com.sofka.domain.rehabilitation.events;

import co.com.sofka.domain.rehabilitation.values.ExcercisesList;
import co.com.sofka.domain.rehabilitation.values.PhysicalTherapistId;
import co.com.sofka.domain.rehabilitation.values.Treatment;
import co.com.sofka.generic.DomainEvent;
import co.com.sofka.generic.FullName;

public class PhysicalTherapistAdded extends DomainEvent {

    private final PhysicalTherapistId physicalTherapistId;
    private final FullName fullName;
    private final Treatment treatment;
    private final ExcercisesList excercisesList;

    public PhysicalTherapistAdded(PhysicalTherapistId physicalTherapistId, FullName fullName, Treatment treatment, ExcercisesList excercisesList) {
        super("sofka.rehabilitation.physicalTherapistAdded");
        this.physicalTherapistId = physicalTherapistId;
        this.fullName = fullName;
        this.treatment = treatment;
        this.excercisesList = excercisesList;
    }

    public PhysicalTherapistId PhysicalTherapistId() {
        return physicalTherapistId;
    }

    public FullName FullName() {
        return fullName;
    }

    public Treatment Treatment() {
        return treatment;
    }

    public ExcercisesList ExcercisesList() {
        return excercisesList;
    }
}
