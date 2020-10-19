package com.atticusw.eeaew.generics.define;


//实现类类型确定
public class MyGenericImp2 implements MyGenericInterface<String> {

    @Override
    public void show(String s) {
        System.out.println(s);
    }
}
