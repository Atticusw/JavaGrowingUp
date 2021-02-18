package com.atticusw.eeaew.java8.staticdefault;

public interface FourWheeler {
    default void print() {
        System.out.println("这是一辆四轮车！！");
    }
}
