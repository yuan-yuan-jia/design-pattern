package com.jyy.simplefactory;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入数字A: ");
        double numberA = Double.parseDouble(sc.nextLine());
        System.out.println("请选择运算符号(+、-、*、/):");
        String strOperate = sc.nextLine();
        System.out.println("请输入数字B: ");
        double numberB = Double.parseDouble(sc.nextLine());
        Operation operate = OperationFactory.createOperate(strOperate);
        double result = operate.getResult(numberA, numberB);
        System.out.println("结果是: " + result);

    }
}
