package com.jyy.adapter;

public class Client1 {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
