package com.jyy.command.demo;


// 服务员类
public class Waiter {

    private Command command;


    // 设置订单
    public void setOrder(Command command) {
        this.command = command;
    }


    // 执行通知
    public void notifyCommand() {
        command.executeCommand();
    }


}
