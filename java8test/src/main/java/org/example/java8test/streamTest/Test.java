package org.example.java8test.streamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("peter","mike","john");

        Stream<String> streams = list.stream().filter(s->{
            System.out.println(s);
            return s.startsWith("s");
        });

        System.out.println("count执行");
        long i = streams.count();
        System.out.println(i);

    }
}
