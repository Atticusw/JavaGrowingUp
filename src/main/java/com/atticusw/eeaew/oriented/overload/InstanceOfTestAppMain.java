package com.atticusw.eeaew.oriented.overload;

import com.atticusw.eeaew.oriented.overload.supermarket.LittleSuperMarket;
import com.atticusw.eeaew.oriented.overload.supermarket.MerchandiseV2;
import com.atticusw.eeaew.oriented.overload.supermarket.Phone;

import java.util.Scanner;

public class InstanceOfTestAppMain {

    public static void main(String[] args) {

        int merchandiseCount = 600;
        LittleSuperMarket market = new LittleSuperMarket("大卖场",
                "世纪大道1号", 500, merchandiseCount, 100);
        // instanceOf 操作符就是判断一个引用指向的对象是否是某一个类型或其子类
        for (int i =0;i<merchandiseCount;i++) {
            //如果m是null，也就是需要判断的引用是一个null，那么返回的永远是一个false。
            /*MerchandiseV2 m = null;*/
            MerchandiseV2 m = market.getMerchandiseOf(i);
            if (m instanceof  MerchandiseV2) {
                // 先做判断，再强制类型转换比较安全
                MerchandiseV2 ph = (MerchandiseV2) m;
                System.out.println(ph.getName());
            } else {
                System.out.println("not an instance");
            }
        }

        String s1 = "aaabbb";

        String s2 = "aaa" + "bbb";

        // >> TODO 说好的每次创建一个新的String对象呢？
        System.out.println("s1和s2用==判断结果："+(s1 == s2));

        System.out.println("s1和s2用 equals 判断结果："+(s1.equals(s2)));

        // >> TODO 打乱Java对String的的优化，再试试看
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入s1");
        s1 = scanner.nextLine();

        System.out.println("请输入s2");
        s2 = scanner.nextLine();

        System.out.println("s1和s2用==判断结果："+(s1 == s2));

        System.out.println("s1和s2用 equals 判断结果："+(s1.equals(s2)));
    }
}
