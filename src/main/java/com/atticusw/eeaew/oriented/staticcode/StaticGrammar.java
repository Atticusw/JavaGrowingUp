package com.atticusw.eeaew.oriented.staticcode;

public class StaticGrammar {


    private int a;

    // >> TODO 使用某个静态变量的代码块必须在静态变量后面,但是仅仅赋值没有限制
   // 这段代码在哪个方法中呢？<clinit>，即class init。会在每个class初始化的时候被调用一次
    static {
       // BIP_DISCOUNT = BIP_DISCOUNT * 100;
    }

    public static double BIP_DISCOUNT;

    static class A{
        private String a;
    }

    //todo 外部类可以通过new的方式调用静态内部类的属性
    public void re() {
        String a = new A().a;
    }
    public static void main(String[] args) {
        System.out.println(BIP_DISCOUNT);
    }
}
