package com.jyy.appearance;

public class Client1 {

    public static void main(String[] args) {
        Stock1 stock1 = new Stock1();
        Stock2 stock2 = new Stock2();
        NationDebt1 nd1 = new NationDebt1();
        Realty1 rt1 = new Realty1();


        // 客户需要了解股票、国债、房产情况，
        // 需要参与这些项目的具体买和卖。
        // 耦合性较高
        stock1.buy();
        stock2.buy();

        nd1.buy();
        rt1.buy();

        stock1.sell();
        stock2.sell();
        nd1.sell();
        rt1.sell();

    }
}
