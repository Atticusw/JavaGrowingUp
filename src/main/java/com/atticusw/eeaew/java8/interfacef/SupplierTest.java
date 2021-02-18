package com.atticusw.eeaew.java8.interfacef;

import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest {
    public static void main(String[] args) {
        /*// 相当于一个容器
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                // 返回一个随机数
                return new Random().nextInt();
            }
        };
        System.out.println(supplier.get());
        // 使用 lambda 表达式
        supplier = () -> new Random().nextInt();
        System.out.println(supplier.get());

        // 使用方法引用
        Supplier<Double> supplier2 = Math::random;
        System.out.println(supplier2.get());*/

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> first = stream.filter(i -> i > 4).findFirst();

        //optional对象有需要Supplier接口的方法
        //orElse，如果first中存在数，就返回这个数，如果不存在，就返回传入的数
        System.out.println(first.orElse(1));
        System.out.println(first.orElse(5));

        Supplier<Integer> supplier = () ->new Random().nextInt();
        //orElseGet，如果first中存在数，就返回这个数，如果不存在，就返回supplier返回的值
        System.out.println(first.orElseGet(supplier));
    }
}
