package com.jyy.command.demo;

public class Client2 {
    public static void main(String[] args) {
        // 开店前的准备
        ///  烤肉师傅
        Barbecuer boy = new Barbecuer();
        /// 烤羊肉串
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        /// 烤鸡翅
        Command bakeChickenWingCommand2 = new BakeChickenWingCommand(boy);
        /// 服务员
        Waiter girl = new Waiter();

        /// 开门营业
        /// 下单烤羊肉串
        girl.setOrder(bakeMuttonCommand1);
        /// 通知厨师烤肉
        girl.notifyCommand();
        /// 下单烤羊肉串
        girl.setOrder(bakeMuttonCommand1);
       /// 取消一串羊肉串订单
        girl.cancelOrder(bakeMuttonCommand1);
        /// 下单烤鸡翅
        girl.setOrder(bakeChickenWingCommand2);
        /// 通知厨师
        girl.notifyCommand();
    }
}
