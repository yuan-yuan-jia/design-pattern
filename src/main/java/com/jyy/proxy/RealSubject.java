package com.jyy.proxy;

public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("真实的请求。");
    }
}
