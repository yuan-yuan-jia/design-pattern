package com.jyy.template;

public abstract class AbstractClass {

    public void templateMethod() {
        // 写一些可以被子类共享的的代码
        this.primitiveOperation1();
        this.primitiveOperation2();
    }

    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

}
