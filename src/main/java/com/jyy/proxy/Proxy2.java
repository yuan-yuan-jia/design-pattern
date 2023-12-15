package com.jyy.proxy;

public class Proxy2 implements ISubject{

    private RealSubject rs;

    public Proxy2() {
        this.rs = new RealSubject();
    }

    @Override
    public void request() {
        this.rs.request();
    }
}
