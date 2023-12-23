package com.jyy.state;

public class Client1 {

    public static void main(String[] args) {
        Context c = new Context(new ConcreteStateA());

        // 不断请求，不断更改状态
        c.request();
        c.request();
        c.request();
        c.request();
        c.request();
    }
}
