package com.atticusw.eeaew.java8.refer;

import java.util.function.Supplier;

public class Car {
    // supplier 是接口
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void callide(final Car car) {
        System.out.println("Callied " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }
    public void repair() {
        System.out.println("Repaired " + this.toString());
    }
}
