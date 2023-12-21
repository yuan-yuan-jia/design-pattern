package com.jyy.observer;

public class Client {

    public static void main(String[] args) {
        Subject boss = new Boss("胡汉三");
        //看股票的同事
        Observer employee1 = new StockObserver(
                "魏关姹",
                boss
        );

        Observer employee2 = new StockObserver(
                "易管查",
                boss
        );

        //看NBA的同事
        Observer employee3 = new NBAObserver(
                "兰秋幂",
                boss
        );

        // 老板登记下三个同事
        boss.attach(employee1);
        boss.attach(employee2);
        boss.attach(employee3);

        // 魏关姹其实没有被通知到，所以减去
        boss.detach(employee1);

        // 老板回来了
        boss.setAction("胡汉三回来了");
        // 通知两个同事
        boss.notifyEmployee();

    }
}
