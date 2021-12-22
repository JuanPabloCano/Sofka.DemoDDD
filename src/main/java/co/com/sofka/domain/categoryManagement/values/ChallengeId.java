package co.com.sofka.domain.categoryManagement.values;

import co.com.sofka.generic.Id;

public class ChallengeId extends Id {

    private ChallengeId(String value) {
        super(value);
    }

    public ChallengeId() {
    }

    public static ChallengeId of(String value) {
        return new ChallengeId(value);
    }

}
