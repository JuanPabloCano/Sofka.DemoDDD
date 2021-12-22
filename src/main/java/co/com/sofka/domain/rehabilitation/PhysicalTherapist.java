package co.com.sofka.domain.rehabilitation;

import co.com.sofka.domain.rehabilitation.values.ExcercisesList;
import co.com.sofka.domain.rehabilitation.values.PhysicalTherapistId;
import co.com.sofka.domain.rehabilitation.values.Treatment;
import co.com.sofka.generic.Entity;
import co.com.sofka.generic.FullName;

import java.util.List;
import java.util.Objects;

public class PhysicalTherapist extends Entity<PhysicalTherapistId> {

    private FullName fullName;
    private Treatment treatment;
    private List<ExcercisesList> excercisesList;

    public PhysicalTherapist(PhysicalTherapistId physicalTherapistId, FullName fullName, Treatment treatment,
                             List<ExcercisesList> excercisesList) {
        super(physicalTherapistId);
        this.fullName = Objects.requireNonNull(fullName);
        this.treatment = Objects.requireNonNull(treatment);
        this.excercisesList = Objects.requireNonNull(excercisesList);
    }

    public FullName FullName() {
        return fullName;
    }

    public void addFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public Treatment Treatment() {
        return treatment;
    }

    public void createTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public List<ExcercisesList> ExcercisesList() {
        return excercisesList;
    }

    public void selectExcercises(List<ExcercisesList> excercisesList) {
        this.excercisesList = excercisesList;
    }
}
