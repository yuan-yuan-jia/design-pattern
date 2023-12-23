package com.jyy.state.work;

// 上午工作状态
public class ForenoonState extends WorkState{
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 12) {
            System.out.println("当前时间:" + w.getHour() +
                    "点上午工作，精神百倍"
                    );
        }else {
            w.setState(new NoonState());
        }
    }
}
