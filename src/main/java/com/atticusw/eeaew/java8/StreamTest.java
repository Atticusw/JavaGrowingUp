package com.atticusw.eeaew.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        // 生成流
        /*List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        Predicate<String> predicate = s -> !s.isEmpty();
        List<String> filterd = strings.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(filterd);*/
        //map 方法用于映射每个元素到对应的结果,返回的是各不相同的元素
       /* List<Integer> integerList = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        Function<Integer,Integer> squareFunction = (s) -> s*s;
        List<Integer> squaresList = integerList.stream().map(squareFunction).distinct().collect(Collectors.toList());
        System.out.println(squaresList);*/
        // filter 方法用于通过设置的条件过滤出元素。
        /*List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        Predicate<String> predicate = String::isEmpty;

        long count = strings.stream().filter(predicate).count();
        System.out.println(count);*/
        /*Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);*/
        /*Random random = new Random(10);
        random.ints().limit(10).sorted().forEach(System.out::println);*/
        /*List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        long count = strings.parallelStream().filter(String::isEmpty).count();
        System.out.println(count);*/
        /*List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 将流转换成集合
        List<String> collect = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println(collect);
        // 将流合并为字符串
        String collect1 = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(", "));
        System.out.println(collect1);*/
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());

    }
}
