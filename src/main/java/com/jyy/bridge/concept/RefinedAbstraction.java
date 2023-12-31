package com.jyy.bridge.concept;


public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        System.out.println("具体的Abstraction");
        implementor.operation();
    }
}
