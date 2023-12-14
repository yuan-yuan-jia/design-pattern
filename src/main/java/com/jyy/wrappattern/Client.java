package com.jyy.wrappattern;

public class Client {

    public static void main(String[] args) {
        Person xc = new Person("小菜");
        System.out.println("第一种打扮");
        xc.wearTShirts();
        xc.wearBigTrouser();
        xc.wearSneakers();
        xc.show();

        System.out.println("第一种打扮");
        xc.wearSuit();
        xc.wearTie();
        xc.wearLeatherShoes();
        xc.show();


    }
}
