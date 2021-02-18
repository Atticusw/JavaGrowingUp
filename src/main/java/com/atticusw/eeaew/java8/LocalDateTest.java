package com.atticusw.eeaew.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDateTest dateTest = new LocalDateTest();
        dateTest.testLocalDateTime();
    }
    public void testLocalDateTime() {
        // 获取当前日期时间 2021-02-18T10:17:47.272
        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前时间：" + now);
        // 获取 localDate  2021-02-18
        LocalDate localDate = now.toLocalDate();
        System.out.println("localDate: " + localDate);
        // 获取 localTime  10:22:40.833
        LocalTime localTime = now.toLocalTime();
        System.out.println("localTime: " + localTime);

        // 获取月
        Month month = now.getMonth();
        int monthValue = now.getMonthValue();
        // 获取日
        int dayOfMonth = now.getDayOfMonth();
        // 获取秒
        int second = now.getSecond();
        System.out.println("月: " + monthValue +", 日: " + dayOfMonth +", 秒: " + second);

        LocalDateTime date2 = now.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        // 2014-12-12
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);

        // 22:15
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);
        // 解析字符串
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);
    }
}
