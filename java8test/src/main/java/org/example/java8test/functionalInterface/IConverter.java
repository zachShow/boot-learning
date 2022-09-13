package org.example.java8test.functionalInterface;

@FunctionalInterface
public interface IConverter<F,T> {

    abstract T convert(F value);

    default void test1(){}

    default void test2(){}
}
