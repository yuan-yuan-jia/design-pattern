package com.jyy.strategy;

//收费抽象类
public class CashSuper implements ISale{

    protected ISale component;

    public void decorate(ISale component) {
        this.component = component;
    }


    // 收取费用的抽象方法，参数为单价和数据量
    public double acceptCash(double price, int num) {
        double result = 0d;
        if (this.component != null) {
            // 若被装饰对象存在，则执行被装饰的算法对象
            result = this.component.acceptCash(price, num);
        }
        return result;
    }
}
