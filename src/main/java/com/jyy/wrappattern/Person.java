package com.jyy.wrappattern;

public class Person implements ICharacter{
    
    private String name;
    
    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.print("装扮的" + name);
    }
}
