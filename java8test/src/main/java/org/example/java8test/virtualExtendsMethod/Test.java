package org.example.java8test.virtualExtendsMethod;

public class Test {
    /**
     * 虚拟拓展方法
     * 接口中的方法通过default修饰可以添加函数体
     * 实现和创建匿名对象不需要重写default方法
     *
     * @param args
     */
    public static void main(String[] args) {
        TestService service = new TestService() {
            @Override
            public void test() {
                System.out.println("test");
            }
        };

        service.test();
        service.test2("test2方法输出的信息");
    }
}
