package com.jyy.bridge.concept;

public abstract class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();

}
