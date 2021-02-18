package com.atticusw.eeaew.java8.staticdefault;

public class Car implements Vehicle,FourWheeler{
    @Override
    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("我是一辆汽车！");
    }
}
