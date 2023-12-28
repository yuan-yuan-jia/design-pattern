package com.jyy.composite;

public class Client1 {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));

        root.add(comp);

        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("Leaf XYB"));
        comp2.add(new Leaf("Leaf XYA"));
        comp.add(comp2);

        Leaf leaf = new Leaf("Leaf C");
        root.add(leaf);

        Leaf leaf2 = new Leaf("Leaf D");
        root.add(leaf2);
        root.remove(leaf2);
        root.display(1);
    }
}
