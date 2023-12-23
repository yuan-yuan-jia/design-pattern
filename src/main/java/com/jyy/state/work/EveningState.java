package com.jyy.state.work;

public class EveningState extends WorkState {
    @Override
    public void writeProgram(Work w) {
        if (w.isWorkFinished()) {
            w.setState(new RestState());
            w.writeProgram();
        }else {
            if (w.getHour() < 21) {
                System.out.println("当前时间: " + w.getHour() +
                        "点 加班哦，疲累之极"
                        );
            }else {
                w.setState(new SleepingState());
                w.writeProgram();
            }
        }
    }
}
