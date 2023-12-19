package com.jyy.builder;

public abstract class Builder {

    // 建造部件A
    public abstract void buildPartA();
    // 建造部件B
    public abstract void buildPartB();
    // 得到产品
    public abstract Product getResult();
}
