package com.atticusw.eeaew.generics.define;

public class MyGenericClassCopy<First,Second,thes> {

    private First first;

    public MyGenericClassCopy(First first) {
        this.first = first;
    }

    public First getFirst() {
        return first;
    }

    public void setFirst(First first) {
        this.first = first;
    }


}
