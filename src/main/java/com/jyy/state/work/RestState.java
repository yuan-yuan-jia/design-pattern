package com.jyy.state.work;

public class RestState extends WorkState {
    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间: " + w.getHour() + "点 下班回家");
    }
}
