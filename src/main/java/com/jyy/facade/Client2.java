package com.jyy.facade;

public class Client2 {

    public static void main(String[] args) {
        Fund fund1 = new Fund();
        // 基金购买
        fund1.buyFund();
        // 基金赎回
        fund1.sellFund();
    }
}
