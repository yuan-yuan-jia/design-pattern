package com.jyy.strategy;

import java.util.Scanner;

public class Client1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入商品价格");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("输入商品数量");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("输入计算策略类型");
        int discountType = Integer.parseInt(sc.nextLine());

        CashSuper cashAccept = CashFactory.createCashAccept(discountType);
        double result = cashAccept.acceptCash(price, num);
        System.out.println("应付金额为:" + result);
    }
}
