package com.atticusw.eeaew.oriented.Polymorphism;

public class ShellColorChangePhone extends Phone{

    private boolean enableShellColorChange;

    public ShellColorChangePhone(
            String name, String id, int count, double soldPrice, double purchasePrice,
            double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os
    ){
        super(name, id, count, soldPrice, purchasePrice, screenSize, cpuHZ, memoryG, storageG, brand, os);
        enableShellColorChange = true;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("壳色随着屏幕色变的功能开启状态：" + enableShellColorChange);
    }

    @Override
    public double calculateProfit() {
        //因为父类Phone没有覆写calculateProfit方法，所以调用的是Phone父类的方法。
        //因为父类Phone没有覆写calculateProfit方法，所以调用的是Phone父类的方法。
        double profit = super.calculateProfit();

        return profit + profit * 0.1;
    }
}
