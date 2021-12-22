package co.com.sofka.domain.rehabilitation.values;

import co.com.sofka.generic.Id;

public class UserId extends Id {

    private UserId(String value){
        super(value);
    }
    public UserId(){}

    public static UserId of(String value){
        return new UserId(value);
    }

}
