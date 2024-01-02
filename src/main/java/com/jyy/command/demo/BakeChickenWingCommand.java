package com.jyy.command.demo;

// 烤鸡翅命令类
public class BakeChickenWingCommand extends Command{
    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeChickenWing();
    }
}
