package com.atticusw.eeaew.java8.staticdefault;

public interface Vehicle {

    // 默认方法
    default void print() {
        System.out.println("这是一辆车！！");
    }

    // 静态默认方法
    static void blowHorn() {
        System.out.println("按喇叭！！");
    }

}
