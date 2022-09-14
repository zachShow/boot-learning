package org.example.java8test.functionalInterface;

import java.math.BigDecimal;

public class Test {

    public static void test1(){
        IConverter<String,Integer> converter = Integer::valueOf;
        Integer i = converter.convert("1");
        System.out.println(i.getClass() + ":" + i);
    }

    public static void test2(){
        Something something = new Something();
        IConverter<String,String> converter = something::startWith;
        String s = converter.convert("string");
        System.out.println(s);
    }

    public static void test3(){
        PersonFactory<Person> factory = Person::new;
        Person spiderMan = factory.create("peter","parker");

        PersonFactory2<Person> factory2 = Person::new;
        Person batMan = factory2.create();
        batMan.setFirstName("bruce");
        batMan.setLastName("wayne");

        System.out.println(spiderMan);
        System.out.println(batMan);
    }


    public static void main(String[] args) {
        test3();
    }

}
