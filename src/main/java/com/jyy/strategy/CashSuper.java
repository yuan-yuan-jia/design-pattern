package com.jyy.strategy;

//收费抽象类
public abstract class CashSuper {

    // 收取费用的抽象方法，参数为单价和数据量
    public abstract double acceptCash(double price,int num);
}
