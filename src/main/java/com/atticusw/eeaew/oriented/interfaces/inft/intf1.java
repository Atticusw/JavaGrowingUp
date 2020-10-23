package com.atticusw.eeaew.oriented.interfaces.inft;

public interface intf1 {
    void m1();

    // 默认方法，如果不实现，就直接使用接口的默认实现
   default String get(){
       return "123";
   }
}
