package com.atticusw.eeaew.oriented.abstractclass.supermarket;


import java.util.Date;

// todo 因为接口里的方法默认都是被public abstract 修饰的，所以abstract class 不需要实现接口的方法
// // TODO  简单的来说，抽象类 1, 是被abstract修饰，2,不可以被实例化，
// todo 实际上抽象类就是 接口和类的结合体
public abstract class AbstractExpireDateMerchandise extends MerchandiseV2 implements ExpireDateMerchandise{

    private Date produceDate;
    private Date expiretionDate;

    public AbstractExpireDateMerchandise(String name, String id, int count, double soldPrice, double purchasePrice, Date produceDate, Date expirationDate) {
        super(name, id, count, soldPrice, purchasePrice);
        this.expiretionDate = expirationDate;
        this.produceDate = produceDate;
    }

    // todo 抽象类里自己定义的抽象方法，可以试protected， 也可以是缺省的，这点和接口是不一样的
    protected abstract void test();

}
