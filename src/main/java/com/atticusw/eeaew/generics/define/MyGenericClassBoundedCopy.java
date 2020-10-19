package com.atticusw.eeaew.generics.define;

import com.atticusw.eeaew.generics.ext.GrandParent;

public class MyGenericClassBoundedCopy <Mytype extends GrandParent>{

    private Mytype mytype;

    public MyGenericClassBoundedCopy(Mytype mytype) {
        this.mytype = mytype;
    }

    public Mytype getMytype() {
        return mytype;
    }
}



