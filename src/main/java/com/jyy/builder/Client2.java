package com.jyy.builder;

public class Client2 {

    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        // 指挥者用ConcreteBuilder1的方法来创建产品
        director.construct(b1);
        Product p1 = b1.getResult();
        p1.show();

        // 指挥者用ConcreteBuilder2的方法来建造产品
        director.construct(b2);
        Product p2 = b2.getResult();
        p2.show();
    }
}
