package com.atticusw.eeaew.java8.interfacef;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>(){
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        };
        Stream<String> stream = Stream.of("aa", "bb", "cc", "dd");
        stream.forEach(consumer);
        // 使用 lambda 表达式
        Consumer<String> conLambda = (s) -> System.out.println(s);
        stream.forEach(conLambda);
        // 使用方法的引用
        Consumer<String> conMethodRef = System.out::println;
        stream.forEach(conMethodRef);
    }
}
