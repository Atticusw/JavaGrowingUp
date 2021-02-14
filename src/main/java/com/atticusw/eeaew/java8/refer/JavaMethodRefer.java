package com.atticusw.eeaew.java8.refer;

import java.util.Arrays;
import java.util.List;

public class JavaMethodRefer {
    public static void main(String[] args) {
        // 构造器引用
        Car car = Car.create(Car::new);
        List<Car> cars = Arrays.asList(car);
        // 静态方法引用
        cars.forEach(Car::callide);
        // 特定类的任意对象的方法引用
        cars.forEach(Car::repair);
        // 特定对象的方法引用
        Car police = Car.create(Car::new);
        cars.forEach( police::follow);
    }
}
