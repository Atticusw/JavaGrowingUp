package com.atticusw.eeaew.oriented.array;

public class RefArray {

    public static void main(String[] args) {
        // 数组在创建出来之后，会按照类型给数组中的每个元素赋缺省值。
        // 引用类型的缺省值是null
        MerchandiseArray[] merchandiseArray = new MerchandiseArray[10];
        merchandiseArray[0] = new MerchandiseArray();
        merchandiseArray[0].count = 10;
        System.out.println(merchandiseArray[0].count);
        System.out.println(merchandiseArray[0]);
    }




}
