package org.example.java8test.functionalInterface;

@FunctionalInterface
public interface PersonFactory<P extends Person> {
    P create(String firstName,String lastName);

    static void testStatic(){

    }
}
