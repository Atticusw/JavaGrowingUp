package com.atticusw.eeaew.oriented.extend;

public class PhoneExtendsMerchandise extends MerchandiseV2{

    //给phone增加新的属性

    private double screenSize;
    private double cpuHz;
    private int memoryG;
    private int storageG;
    private String brand;
    private String os;


    public PhoneExtendsMerchandise(String name, String id, int count, double soldPrice, double purchasePrice,
                                   double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os) {

        this.screenSize = screenSize;
        this.cpuHz = cpuHZ;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;

        //使用this.setName(name);
       /* super.name = name;*/
        this.setName(name);
        super.id = id;
        super.count = count;
        super.soldPrice = soldPrice;
        super.purchasePrice = purchasePrice;

    }
    public void describePhone() {
        System.out.println("此手机商品属性如下");
        super.decribe();
        System.out.println("手机厂商为" + brand + "；系统为" + os + "；硬件配置如下：\n" +
                "屏幕：" + screenSize + "寸\n" +
                "cpu主频" + cpuHz + " GHz\n" +
                "内存" + memoryG + "Gb\n" +
                "存储空间" + storageG + "Gb\n");

    }
}
