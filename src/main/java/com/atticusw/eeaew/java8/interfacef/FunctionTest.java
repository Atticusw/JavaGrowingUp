package com.atticusw.eeaew.java8.interfacef;

import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionTest {
    public static void main(String[] args) {
        // 使用map方法，泛型的第一个参数是转换前的类型，第二个是转化后的类型
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String o) {
                return o.length();
            }
        };
        Stream<String> stream = Stream.of("aaa", "bbbd", "ccccc");
        Stream<Integer> integerStream = stream.map(function);
        integerStream.forEach(System.out::println);

    }
}
