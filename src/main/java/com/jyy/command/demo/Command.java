package com.jyy.command.demo;

// 抽象命令类
public abstract class Command {

    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    // 执行命令
    public abstract void executeCommand();
}
