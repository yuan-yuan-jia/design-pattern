package com.jyy.command.demo;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

// 服务员类
public class Waiter {

    //private Command command;


    private ArrayList<Command> orders = new ArrayList<>();


    // 设置订单
    public void setOrder(Command command) {
        String simpleName = command.getClass().getSimpleName();
        if (simpleName.equals("BakeChickenWingCommand")) {
            System.out.println("服务员: 鸡翅没有了，请点别的烧烤");
        }else {
            this.orders.add(command);
            System.out.println("增加订单: " + simpleName + ",时间:" + getNowTime());
        }
    }


    // 取消订单
    public void cancelOrder(Command command) {
        String className = command.getClass().getSimpleName();
        orders.remove(command);
        System.out.println("取消订单: " + className + "时间:" + getNowTime());
    }

    private String getNowTime() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }

    // 执行通知
    public void notifyCommand() {
        for (Command order : orders) {
            order.executeCommand();
        }
    }


}
