package co.com.sofka.domain.academy.values;

import co.com.sofka.generic.Id;

public class StudentId extends Id {

    private StudentId(String value){
        super(value);
    }
    public StudentId(){}

    public static StudentId of(String value){
        return new StudentId(value);
    }
}
