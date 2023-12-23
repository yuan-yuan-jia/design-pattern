package com.jyy.state.work;

public class NoonState extends WorkState {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 13) {
            System.out.println("当前时间: " + w.getHour() + "点饿了，午饭；犯困；午休");
        }else {
           w.setState(new AfternoonState());
           w.writeProgram();
        }
    }
}
