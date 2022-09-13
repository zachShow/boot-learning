package org.example.java8test.functionalInterface;

@FunctionalInterface
public interface PersonFactory2<P extends Person> {
    P create();
}
