package com.atticusw.eeaew.oriented.constructor;

public class ConstructorOverload {

    private String name;
    private int  age;

    public ConstructorOverload() {
        this.age = 0;
    }

    public ConstructorOverload(String name) {
        // >> TODO 在构造方法里才能调用重载的构造方法时，必须是方法的第一行。后面可以继续有代码
        this();
        this.name = name;
    }
    public ConstructorOverload(String name, int age) {
        // 在调用重载的构造方法时，不可以使用成员变量。因为用语意上讲，这个对象还没有被初始化完成，处于中间状态。
       // this(this.name + "1");

    }
}
