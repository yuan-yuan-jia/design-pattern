package com.jyy.singleton;

public class Singleton {

    // 饿汉式
//    private static Singleton instance = new Singleton();


    private volatile static Singleton instance;

    private Singleton(){}



    // 懒汉式
    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }




        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }





}
