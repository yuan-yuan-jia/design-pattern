package com.jyy.wrappattern;

public class Client {

    public static void main(String[] args) {
        Person xc = new Person("小菜");
        System.out.println("第一种打扮");
        Finery dtx = new TShirts();
        dtx.decorate(xc);
        Finery kk = new BigTrouser();
        kk.decorate(xc);
        Finery pqx = new Sneakers();
        pqx.decorate(xc);
        dtx.show();
        kk.show();
        pqx.show();
        xc.show();
        System.out.println();
        System.out.println("第二种打扮");
        Finery xz = new Suit();
        xz.decorate(xc);
        Finery ld = new Tie();
        ld.decorate(xc);
        Finery px = new LeatherShoes();
        px.decorate(xc);
        xz.show();
        ld.show();
        px.show();
        xc.show();
    }
}
