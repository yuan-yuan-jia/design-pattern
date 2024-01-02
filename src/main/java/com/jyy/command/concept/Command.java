package com.jyy.command.concept;


// 抽象命令类
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    // 执行命令
    public abstract  void executeCommand();

}
