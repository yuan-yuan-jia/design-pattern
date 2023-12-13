package com.jyy.strategy;

public class CashContext {

    private CashSuper cs;

    public CashContext(int cashType) {
        switch (cashType) {
            case 1:
                this.cs = new CashNormal();
                break;
            case 2:
                this.cs = new CashRebate(0.8d);
                break;
            case 3:
                this.cs = new CashRebate(0.7d);
                break;
            case 4:
                this.cs = new CashReturn(300d,100d);
                break;
        }

    }



    public double getResult(double price,int num) {
        return this.cs.acceptCash(price, num);
    }


}
