package com.atticusw.eeaew.oriented.clazz.anonymous;

public class Phone extends MerchandiseV2{

    // 给Phone增加新的属性和方法
    private double screenSize;
    private UnitSpec cpu;
    private UnitSpec memoryG;
    private int storageG;
    private String brand;
    private String os;
    private double speed;



    // todo 匿名类的语法如下，new后面跟着一个接口或抽象类
    private UnitSpec anywhere = new UnitSpec() {
        @Override
        public double getNumSpec() {
            //都有一个外部类的this
            return Phone.this.speed;
        }

        @Override
        public String getProducer() {
            return "here";
        }
    };
}
