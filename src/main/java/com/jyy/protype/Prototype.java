package com.jyy.protype;

public abstract class Prototype implements Cloneable{

    private String id;

    public Prototype(String id) {
        this.id = id;
    }


    public String getId() {
        return this.id;
    }


    public Object clone() {
        Object object = null;
        try {
            object = super.clone();
        }catch (CloneNotSupportedException exception) {
            System.err.println("Clone异常");
        }
        return object;
    }
}
