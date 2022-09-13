package org.example.java8test.lambdaTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCompare {
    /**
     * 通过Lambda使得代码更简练，可读性更高
     * @param args
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        // 方法1
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        // 方法2
        Collections.sort(names, (String a,String b) -> {
            return b.compareTo(a);
        });

        // 方法3
        Collections.sort(names, (String a,String b) -> b.compareTo(a));

        // 方法4
        names.sort((a, b) -> b.compareTo(a));
    }
}
