package com.jyy.bridge.concept;

public class Client2 {
    public static void main(String[] args) {
        Abstraction ab;
        ab = new RefinedAbstraction();

        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();

    }
}
