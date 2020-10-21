package com.atticusw.eeaew.oriented.extend;

public class HuaweiPhone extends PhoneExtendsMerchandise{

   /* //因为父类没有无参构造方法，所以子类必须要有有参构造方法
    public HuaweiPhone(){

    }
    */
    public HuaweiPhone(String name, String id, int count, double soldPrice, double purchasePrice, double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os){
        super(name, id, count, soldPrice, purchasePrice, screenSize, cpuHZ, memoryG, storageG, brand, os);
    }
}
