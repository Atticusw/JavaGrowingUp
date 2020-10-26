package com.atticusw.eeaew.oriented.clazz.partial;

public class Phone extends MerchandiseV2{

    // 给Phone增加新的属性和方法
    private double screenSize;
    private UnitSpec cpu;
    private UnitSpec memoryG;
    private int storageG;
    private String brand;
    private String os;
    private double speed;


    // todo 接口也可以定义为静态内部接口（静态修饰符可以省略），但是一般不这么做。接口的目的就是为了让更多的人实现，所以一般会单独一个文件作为公共接口
    public  interface UnitSpec {
        double getNumSpec();
        String getProducer();
    }

    public Phone(
            String name, String id, int count, double soldPrice, double purchasePrice,
            double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os
    ) {
        double localCPUHZ = cpuHZ;

        class CPU implements UnitSpec {
            // >> TODO 可以有final static的基本数据类型变量
            final static int abc = 99;

            private String producer;

            public CPU(String producer) {
                this.producer = producer;
            }

            @Override
            public double getNumSpec() {
                // todo 局部内部类，代码和这个类本省的访问权限是一样，可以访问外部（Phone） 的private属性
                // todo 局部内部类中有一个外部类的引用
                // todo 局部内部类访问外部类对象的成员属性的完整写法如下，类名.this.属性/方法
                // todo 以上都和成员内部类一样。除此之外，局部内部类还可以访问参数和局部变量，但是它俩必须是实际final的
                return Math.max(Phone.this.speed, Math.max(cpuHZ, localCPUHZ));
            }

            @Override
            public String getProducer() {
                return null;
            }

            // >> TODO 局部内部类，就好像局部变量一样，方法内部的东西出了代码就不可被访问，
            // >> TODO 所以可以再定义类，但是不能有访问控制符，也不能是static，就好像成员变量没有访问控制符没有static一样
            // >> TODO 但是可以有final。记忆要点：和局部变量一样
//            final class ABC {
//                public void test() {
//
//                }
//            }
        }
    }

}
