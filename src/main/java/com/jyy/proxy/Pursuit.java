package com.jyy.proxy;


/**
 * 追求者
 */
public class Pursuit  implements IGiveGIft {

    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    public void giveDolls() {
        System.out.println(this.mm.getName() + ",你好!送你洋娃娃");
    }

    public void giveFlowers() {
        System.out.println(this.mm.getName() + ",你好! 送你鲜花");
    }

    public void giveChocolate() {
        System.out.println(this.mm.getName() + ",你好！送你巧克力");
    }


}
