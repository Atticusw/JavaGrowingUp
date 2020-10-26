package com.atticusw.eeaew.oriented.clazz.innerclazz;

import java.lang.reflect.Array;

public class Phone extends MerchandiseV2{

    // 给Phone增加新的属性和方法
    private double screenSize;
    private CPU cpu;
    private Memory memory;
    private int storageG;
    private String brand;
    private String os;
    private double speed;
    private int memoryG;

    public class CPU {
        // todo 可以有final static 的基本变量，不可以有final static引用类型
        final static int abc = 99;
        private String producer;

        public CPU(String producer) {
            this.producer = producer;
        }
        // >> TODO 成员内部类，代码和这个类本身的访问权限一样，可以访问外部（Phone）的private属性
        // >> TODO 成员内部类中有一个外部类的引用，其访问外部类的对象的成员属性就是使用这个引用，完整写法是：类名.this.属性/方法
        public double getSpeed() {
            return Phone.this.speed;
        }

        // >> TODO 成员内部类，里面可以有任意合法的类的组成部分，包括成员内部类，但是不可以有静态内部类
//        public class ABC{
//            public void test(){
//
//            }
//        }

    }

    public class Memory {
        private String producer;

        public Memory(String producer) {
            this.producer = producer;
        }

        public double getSpeed() {
            return Phone.this.memoryG;
        }

        public String getProducer() {
            return producer;
        }

        public void setProducer(String producer) {
            this.producer = producer;
        }

        @Override
        public String toString() {
            return "Memory{" +
                    "memoryG=" + memoryG +
                    ", producer='" + producer + '\'' +
                    '}';
        }
    }


    public void accessStaticClass() {
        // >> TODO 同样，外部类也可以访问成员内部类（CPU）的private属性
        // 仅作演示访问性，不具有实际意义
        this.cpu.producer = "";
    }

    public Phone(
            String name, String id, int count, double soldPrice, double purchasePrice,
            double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os
    ) {
        this.screenSize = screenSize;
        // >> TODO 可以像平常的类一样使用成员内部类
        this.speed = cpuHZ;
        this.memoryG = memoryG;
        this.cpu = new CPU("Default");
        this.memory = new Memory("Default");
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;

        this.setName(name);
        this.setId(id);
        this.setCount(count);
        this.setSoldPrice(soldPrice);
        this.setPurchasePrice(purchasePrice);
    }

}
