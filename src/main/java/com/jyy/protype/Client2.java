package com.jyy.protype;

public class Client2 {

    public static void main(String[] args) {
        ConcretePrototype p1 = new ConcretePrototype(
                "编号123456"
        );
        System.out.println("原ID:" + p1.getId());


        ConcretePrototype c1 = (ConcretePrototype) p1.clone();

        System.out.println("克隆ID:" + c1.getId());

    }
}
