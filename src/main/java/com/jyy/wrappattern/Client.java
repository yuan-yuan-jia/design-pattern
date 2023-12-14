package com.jyy.wrappattern;

public class Client {

    public static void main(String[] args) {
        Person xc = new Person("小菜");
        System.out.println("第一种打扮");
        Finery dtx = new TShirts();
        Finery kk = new BigTrouser();
        Finery pqx = new Sneakers();
        dtx.show();
        kk.show();
        pqx.show();
        xc.show();

        System.out.println("第一种打扮");
        Finery xz = new Suit();
        Finery ld = new Tie();
        Finery px = new LeatherShoes();
        xz.show();
        ld.show();
        px.show();
        xc.show();


    }
}
