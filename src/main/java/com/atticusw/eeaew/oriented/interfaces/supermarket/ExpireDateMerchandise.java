package com.atticusw.eeaew.oriented.interfaces.supermarket;


import java.util.Date;

// >> TODO 接口的定义使用interface，而非class
// >> TODO 接口中的方法，就是这个类型的规范，接口专注于规范，怎么实现这些规范，它不管
// >> TODO 接口无法被实例话，也就是不可以new一个接口的实例。
public interface ExpireDateMerchandise {

    // >> TODO 接口里的方法都是public abstract修饰的，方法有名字，参数和返回值，没有方法体，以分号;结束，
    // TODO 接口注释最好写一下

    /**
    * @Author wangjijie
    * @Descript 截至到当前，商品保质期天数
    * @Date 15:15 2020/10/22
    * @Param [days]
    * @return boolean
    */
    public abstract boolean notExpireInDays(int days);

    Date getProducedDate();

    public  abstract  Date getExpireDate();

    /**
     * @return 截止到当前，剩余保质期还剩下总保质期长度的百分比
     */
    double leftDatePercentage();


    /**
     * 根据剩余的有效期百分比，得出商品现在实际的价值
     * @param leftDatePercentage 剩余有效期百分比
     * @return 剩余的实际价值
     */
    double actualValueNow(double leftDatePercentage);

    // >> TODO 缺省的实现方法，用default修饰，可以有方法体
    default boolean defaultInteface(boolean result) {
        return result;
    };

    // >> TODO 接口里不能定义局部变量，定义的变量默认都是public static final的，这三个修饰符同样可以省略

    public static final int VAL_IN_INTERFACE = 999;


    // >> TODO 接口中可以有私有方法，不需要用default修饰,java 9新特性
    // >> TODO 接口里的私有方法，可以认为是代码直接插入到使用的地方
    /*private long daysBeforeExpire() {
        long expireMS = getExpireDate().getTime();
        long left = expireMS - System.currentTimeMillis();
        if (left < 0) {
            return -1;
        }
        // 返回值是long，是根据left的类型决定的
        return left / (24 * 3600 * 1000);
    }*/
}
