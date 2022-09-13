package org.example.java8test.functionalInterface;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Person {
    Person(){

    }

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;
}
