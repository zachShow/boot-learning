package org.example.java8test.virtualExtendsMethod;

public interface TestService {

    void test();

    default void test2(String msg){
        System.out.println("输出信息：" + msg);
    }
}
