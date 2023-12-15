package com.jyy.proxy;

/**
 * 代理类
 */
public class Proxy implements IGiveGIft{


    private Pursuit gg;
    private SchoolGirl mm;
    public Proxy(SchoolGirl mm) {
        this.gg = new Pursuit(mm);
    }

    public void giveDolls() {
        this.gg.giveDolls();
    }

    public void giveFlowers() {
       this.gg.giveFlowers();
    }

    public void giveChocolate() {
        this.gg.giveChocolate();
    }


}
