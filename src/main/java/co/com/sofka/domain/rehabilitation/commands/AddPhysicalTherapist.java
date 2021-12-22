package co.com.sofka.domain.rehabilitation.commands;

import co.com.sofka.domain.rehabilitation.values.ExcercisesList;
import co.com.sofka.domain.rehabilitation.values.PhysicalTherapistId;
import co.com.sofka.domain.rehabilitation.values.Treatment;
import co.com.sofka.generic.FullName;

public class AddPhysicalTherapist {
    private final PhysicalTherapistId physicalTherapistId;
    private final FullName fullName;
    private final Treatment treatment;
    private final ExcercisesList excercisesList;

    public AddPhysicalTherapist(PhysicalTherapistId physicalTherapistId, FullName fullName, Treatment treatment, ExcercisesList excercisesList) {
        this.physicalTherapistId = physicalTherapistId;
        this.fullName = fullName;
        this.treatment = treatment;
        this.excercisesList = excercisesList;
    }

    public PhysicalTherapistId getPhysicalTherapistId() {
        return physicalTherapistId;
    }

    public FullName getFullName() {
        return fullName;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public ExcercisesList getExcercisesList() {
        return excercisesList;
    }
}
