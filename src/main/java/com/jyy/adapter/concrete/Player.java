package com.jyy.adapter.concrete;


// 球员
public abstract class Player {

    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void defense();

}
