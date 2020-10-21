package com.atticusw.eeaew.oriented.array;

public class ArrayIsClass {

    // "数组变脸"，其背后真身就是引用，数组类型就是一种特殊的类
    public static void main(String[] args) {
        double[][] double2Array = new double[2][3];
        //第一行
        double2Array[1] = new double[2];
        //第一行第二列
        double2Array[1][2] = 9.0;
    }
}
