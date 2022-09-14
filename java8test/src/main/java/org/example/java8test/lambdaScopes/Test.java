package org.example.java8test.lambdaScopes;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Test {




    public static void test1(){
        final String s = "test";
        Predicate<String> predicate = (a) -> s.equals(a);

        boolean flag = predicate.test("test");
        System.out.println(flag);
    }

    public int s1;
    static int s2;

    public void test2(){
        Predicate<String> predicate = (a) -> {
            s1 = 10;
            s2 = 100;
            return true;
        };
        predicate.test("1");
    }

    public static void main(String[] args) {
        Test test = new Test();
        s2 = 0;
        test.s1 = 0;

        test.test2();

        System.out.println(s2);
        System.out.println(test.s1);

        s2 = 0;
        test.s1 = 0;

        System.out.println(s2);
        System.out.println(test.s1);


    }
}
