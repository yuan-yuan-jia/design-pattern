package com.jyy.strategy;

public class CashContext {

    private ISale cs;

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
            case 5:
                // 先打8折，再满300返100
                CashNormal cn = new CashNormal();
                CashReturn cr1 = new CashReturn(300d,100d);
                CashRebate cr2 = new CashRebate(0.8d);
                // 用满300返100算法包装基本的原价算法
                cr1.decorate(cn);
                //打8折算法装饰满300返100算法
                cr2.decorate(cr1);
                // 将包装好的算法组合引用传递给cs对象
                this.cs = cr2;
                break;
            case 6:
                //满200返50，再打7折
                CashNormal cn2 = new CashNormal();
                CashRebate cr3 = new CashRebate(0.7d);
                CashReturn cr4 = new CashReturn(200d,50d);

                // 用打7折算法包装基本的原价算法
                cr3.decorate(cn2);
                // 满200返50算法装饰7折算法
                cr4.decorate(cr3);
                // 将包装好的算法组合引用传递给cs对象
                this.cs = cr4;
                break;
        }

    }



    public double getResult(double price,int num) {
        return this.cs.acceptCash(price, num);
    }


}
