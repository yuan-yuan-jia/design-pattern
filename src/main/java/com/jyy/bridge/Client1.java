package com.jyy.bridge;

public class Client1 {

    public static void main(String[] args) {
        HandsetBrand ab;
        ab = new HandsetBrandM();
        ab.setSoft(new HandsetGame());
        ab.run();


        ab.setSoft(new HandsetAddressList());
        ab.run();


        HandsetBrand ab2;
        ab2 = new HandsetBrandN();


        ab2.setSoft(new HandsetGame());
        ab2.run();
        ab2.setSoft(new HandsetAddressList());
        ab2.run();


    }
}
