package com.jyy.strategy;

public class CashReturn extends CashSuper {


    private  double moneyCondition = 0d;// 返利条件
    private double moneyReturn = 0d;// 返利值

    public CashReturn(double moneyCondition,double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }



    // 计算收费时，当达到返利条件，就原价减去返利值
    @Override
    public double acceptCash(double price, int num) {
        double result = price * num;
        if (moneyCondition > 0 && result >= moneyCondition) {
            result = result - Math.floor(result / moneyCondition) * moneyReturn;
        }
        return super.acceptCash(result,1);
    }
}
