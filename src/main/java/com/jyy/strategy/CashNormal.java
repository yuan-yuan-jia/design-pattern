package com.jyy.strategy;


// 正常收费
public class CashNormal implements ISale {
    // 原价返回
    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }
}
