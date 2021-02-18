package com.atticusw.eeaew.java8.interfacef;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateTest {
    public static void main(String[] args) {
        // 将Predicate作为filter接口，Predicate起到一个判断的作用
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer > 5){
                    return true;
                }
                return false;
            }
        };
        System.out.println(predicate.test(6));

        predicate = (t) -> t > 5;
        System.out.println(predicate.test(1));

        Stream<Integer> stream = Stream.of(1, 23, 3, 4, 5, 56, 6, 6);
        List<Integer> list = stream.filter(predicate).collect(Collectors.toList());
        list.forEach(System.out::println);

    }
}
