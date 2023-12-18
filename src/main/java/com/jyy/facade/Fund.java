package com.jyy.facade;

// 基金类
public class Fund {
    Stock1 stock1;
    Stock2 stock2;
    NationDebt1 nd1;
    Realty1 rt1;


    // 基金很多买入卖出操作，持仓比列等，
    // 无须提前告知客户

    public Fund() {
        stock1 = new Stock1();
        stock2 = new Stock2();
        nd1 = new NationDebt1();
        rt1 = new Realty1();
    }


    public void buyFund() {
        stock1.buy();
        stock2.buy();
        nd1.buy();
        rt1.buy();
    }

    public void sellFund() {
        stock1.sell();
        stock2.sell();
        nd1.sell();
        rt1.sell();
    }

}
