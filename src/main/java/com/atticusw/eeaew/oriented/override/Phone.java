package com.atticusw.eeaew.oriented.override;

public class Phone extends MerchandiseV2 {

    private double screenSize;
    private double cpuHZ;
    private int memoryG;
    private int storageG;
    private String brand;
    private String os;

    private static int MAX_BUY_ONE_ORDER = 5;

    public Phone(String name, String id, int count, double soldPrice, double purchasePrice, double screenSize, double cpuHZ, int memoryG,
                 int storageG, String brand, String os) {
        super(name,id,count, soldPrice * 1.2, purchasePrice);
        this.screenSize = screenSize;
        this.cpuHZ = cpuHZ;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;


    }

    // >> TODO 通过使用和父类方法签名一样，而且返回值也必须一样的方法，可以让子类覆盖(override)掉父类的方法
    public double buy(int count) {
        if (count > MAX_BUY_ONE_ORDER) {
            System.out.println("购买失败，手机一次最多只能买" + MAX_BUY_ONE_ORDER + "个");
            return -2;
        }

        if (this.count < count) {
            System.out.println("购买失败，库存不够");
            return -1;
        }

        this.count -= count;
        double cost = count * soldPrice;
        System.out.println("购买成功，话费为" + cost);
        return cost;
    }

    // >> TODO 返回值必须一样，不是类型兼容，而是必须一摸一样。
    // >> TODO 如果签名一样，但是返回值不一样，会是错误
   /* public int buy(int count) {
        if (count > MAX_BUY_ONE_ORDER) {
           return -2;
      }
        if (this.count < count) {
           return -1;
       }
        return this.count -= count;
   }
*/
    // >> TODO super是子类和父类交流的桥梁，但是并不是父类的引用
    // >> TODO 所以，super和this自引用不一样，不是简单可以模拟的（可以模拟的话不就成了组合了吗）
   /* public MerchandiseV2 getParent() {
        return super;
    }*/


    public void useSuper() {
        // >> TODO super的用法就像是一个父类的引用。它是继承的一部分，像组合的那部分，但不是全部
        super.describe();
        super.buy(66);
        System.out.println("父类里的count属性：" + super.count);
    }


    public void describePhone() {
        System.out.println("此手机商品属性如下");
        describe();
        System.out.println("手机厂商为" + brand + "；系统为" + os + "；硬件配置如下：\n" +
                "屏幕：" + screenSize + "寸\n" +
                "cpu主频" + cpuHZ + " GHz\n" +
                "内存" + memoryG + "Gb\n" +
                "存储空间" + storageG + "Gb");
    }

    public boolean meetCondition() {
        return true;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getCpuHZ() {
        return cpuHZ;
    }

    public void setCpuHZ(double cpuHZ) {
        this.cpuHZ = cpuHZ;
    }

    public int getMemoryG() {
        return memoryG;
    }

    public void setMemoryG(int memoryG) {
        this.memoryG = memoryG;
    }

    public int getStorageG() {
        return storageG;
    }

    public void setStorageG(int storageG) {
        this.storageG = storageG;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
