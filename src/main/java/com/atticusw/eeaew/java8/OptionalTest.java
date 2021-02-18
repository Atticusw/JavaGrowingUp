package com.atticusw.eeaew.java8;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Integer value2 = null;
        Integer value = 10;
        // 允许传递为 null 参数
        Optional<Integer> a = Optional.ofNullable(value2);
        // 如果传递的参数为 null ，抛出异常 NullPointerException
        Optional<Integer> b = Optional.of(value);
        System.out.println(sum(a,b));
    }

    public static Integer sum(Optional<Integer> a, Optional<Integer> b) {
        // 判断值是否存在
        System.out.println("first： " + a.isPresent());
        System.out.println("second: " + b.isPresent());
        // 如果值存在，返回它，否则返回默认值
        Integer value1 = a.orElse(0);
        // 获取值，值需要存在
        Integer value2 = b.get();
        return value1 + value2;
    }
}
