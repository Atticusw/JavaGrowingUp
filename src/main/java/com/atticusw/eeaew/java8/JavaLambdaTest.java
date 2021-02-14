package com.atticusw.eeaew.java8;

public class JavaLambdaTest {
    public static void main(String[] args) {
        JavaLambdaTest tester = new JavaLambdaTest();

        // 类型声明，使用 lambda 表达式实现了接口的方法
        // 直接使用已有对象或实例的方法
        MathOperation addition = Integer::sum;
        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;
        // 大括号中的返回语句，必须要有返回语句
        MathOperation multiplition = (int a, int b) -> {
            return a * b;
        };
        // 没有大括号以及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 * 5 = " + tester.operate(10, 5, multiplition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // 不用括号
        GreetingService g1 = message -> System.out.println("hello " + message);
        // 用括号
        GreetingService g2 = (message) -> System.out.println("hello " + message);
        g1.sayMessage("world!");
        g2.sayMessage("baby!");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
