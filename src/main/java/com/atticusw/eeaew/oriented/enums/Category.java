package com.atticusw.eeaew.oriented.enums;


// 使用enum 进行声明
public enum Category {

    // 必须在开始的时候以这种形式，创建所有的枚举对象
    FOOD(1),
    COOK(2);

    private int id;

    // 构造方法必须是private的，不写也是private的
    Category(int id) {
        this.id = id;
    }

    //枚举的方法
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
