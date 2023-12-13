package com.jyy.strategy;

public class CashFactory {

    public static CashSuper createCashAccept(int cashType) {
        CashSuper cs = null;
        switch (cashType) {
            case 1:
                cs = new CashNormal();
                break;
            case 2:
                cs = new CashRebate(0.8d);
                break;
            case 3:
                cs = new CashRebate(0.7d);
                break;
            case 4:
                // 满300返100
                cs = new CashReturn(300d,100d);
                break;
        }

        return cs;
    }
}
