package com.atticusw.eeaew.generics;

import com.atticusw.eeaew.generics.define.MyGenericClassBounded;
import com.atticusw.eeaew.generics.define.MyGenericClassBoundedCopy;
import com.atticusw.eeaew.generics.ext.Children;
import com.atticusw.eeaew.generics.ext.Parent;

public class MyGenericTest {

    public static void main(String[] args) {
        MyGenericClassBoundedCopy copy = new MyGenericClassBoundedCopy<>(new Children());
       /* MyGenericClassBoundedCopy copy = new MyGenericClassBoundedCopy<>(new Parent());*/
        //调用引用的方法
        int num = copy.getMytype().getNum();
        System.out.println(num);
    }

}
