package com.jyy.proxy;

public class Client1 {

    public static void main(String[] args) {
        SchoolGirl girlLjj = new SchoolGirl();
        girlLjj.setName("李娇娇");

        Proxy boyDl = new Proxy(girlLjj);
        boyDl.giveDolls();
        boyDl.giveFlowers();
        boyDl.giveChocolate();
    }
}
