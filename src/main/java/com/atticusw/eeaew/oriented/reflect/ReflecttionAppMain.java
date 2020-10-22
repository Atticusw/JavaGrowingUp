package com.atticusw.eeaew.oriented.reflect;

import com.atticusw.eeaew.oriented.reflect.supermarket.LittleSuperMarket;
import com.atticusw.eeaew.oriented.reflect.supermarket.MerchandiseV2;
import com.atticusw.eeaew.oriented.reflect.supermarket.Phone;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class ReflecttionAppMain {


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号", 500, 600, 100);
        MerchandiseV2 merchandise = superMarket.getMerchandiseOf(100);
        //获取一个描述MerchandiseV2类Class实例
        //
        Class clazz = Phone.class;
        /*System.out.println(merchandise);
        System.out.println(clazz);
        //获取类的成员变量的类
        Field name = clazz.getField("name");

        String o = (String) name.get(merchandise);
        System.out.println(o.replace("100",""));

        //获取类的所有public成员变量
        Field[] classFields = clazz.getFields();
        //获取类的所有成员变量,但是不包括继承来的成员变量。
        Field[] fields = clazz.getDeclaredFields();


        //将不可访问的成员变量设置可以访问,需要注意的是，要将访问权限设置回去。
        boolean accessible = fields[0].isAccessible();

        fields[0].setAccessible(true);
        fields[0].setAccessible(accessible);
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        //获取父类成员变量
        Field[] declaredFields = clazz.getSuperclass().getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field.getName());
        }


        //获取方法
        Method[] declaredMethods = clazz.getDeclaredMethods();
        //获取访问权限
        boolean accessible1 = declaredMethods[0].isAccessible();
        //设置访问权限
        declaredMethods[0].setAccessible(accessible1);*/

        //使用实例的方法,注意clazz反射的方法必须是他子类或者本类，因为有可能他的父类没有这个方法
        Method describe = clazz.getDeclaredMethod("describe");
        describe.invoke(merchandise);
        describe.invoke(superMarket.getMerchandiseOf(10));
        //clazz实例的父类，所有会抛出参数错误
        describe.invoke(superMarket.getMerchandiseOf(0));




    }
}
