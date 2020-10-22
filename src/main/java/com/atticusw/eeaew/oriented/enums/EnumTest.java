package com.atticusw.eeaew.oriented.enums;

public class EnumTest {

    public static void main(String[] args) {
        System.out.println(Category.COOK.getId());
        Category.COOK.setId(3);
        System.out.println(Category.COOK.getId());

        // 根据名字获取枚举
        System.out.println(Category.valueOf("FOOD"));

        Day friday = Day.FRIDAY;
        System.out.println(friday);

    }
}
