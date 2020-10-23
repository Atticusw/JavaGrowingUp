package com.atticusw.eeaew.oriented.interfaces;

import com.atticusw.eeaew.oriented.array.MerchandiseArray;
import com.atticusw.eeaew.oriented.interfaces.inft.inf1Imp;
import com.atticusw.eeaew.oriented.interfaces.supermarket.ExpireDateMerchandise;
import com.atticusw.eeaew.oriented.interfaces.supermarket.GamePointCard;
import com.atticusw.eeaew.oriented.interfaces.supermarket.MerchandiseV2;
import com.atticusw.eeaew.oriented.interfaces.supermarket.VirtualMerchandise;

import java.util.Date;

public class UseInterface {

    public static void main(String[] args) {
        Date produceDate = new Date();
        Date expireDate = new Date(produceDate.getTime() + 365L * 24 * 3600 * 1000);

        GamePointCard gamePointCard =  new GamePointCard("iphone 12", "001", 100, 1999, 999, produceDate, expireDate);

        //  > TODO 可以用实现接口的类的引用，给接口的引用赋值。类似于可以使用子类的引用给父类赋值
        ExpireDateMerchandise expireDateMerchandise = gamePointCard;
        VirtualMerchandise virtualMerchandise = gamePointCard;

        MerchandiseV2 m = gamePointCard;

        expireDateMerchandise = (ExpireDateMerchandise) m;

        virtualMerchandise = (VirtualMerchandise) m;

        if(m instanceof ExpireDateMerchandise){
            System.out.println("m 是 ExpireDateMerchandise 类型的实例");
        }

        if(m instanceof VirtualMerchandise){
            System.out.println("m 是 VirtualMerchandise 类型的实例");
        }

        inf1Imp inf1Imp = new inf1Imp();

        System.out.println(inf1Imp.get());

    }
}
