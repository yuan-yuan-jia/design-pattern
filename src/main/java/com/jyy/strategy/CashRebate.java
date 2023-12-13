package com.jyy.strategy;


//打折收费
public class CashRebate extends CashSuper{

    private double moneyRebate = 1d;

    // 初始化必须输入折扣率。八折就输入0.8
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }


    @Override
    public double acceptCash(double price, int num) {
        return price * moneyRebate * num;
    }
}
