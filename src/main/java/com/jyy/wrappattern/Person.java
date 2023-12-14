package com.jyy.wrappattern;

public class Person {
    
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public void show() {
        System.out.print("装扮的" + name);
    }
}
