package com.jyy.state.work;

// 工作类
public class Work {
    // 时间钟点
    private int hour;
    private boolean workFinished = false;

    private WorkState state;


    public Work() {
        state = new ForenoonState();
    }



    public WorkState getState() {
        return state;
    }

    public void setState(WorkState state) {
        this.state = state;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isWorkFinished() {
        return workFinished;
    }

    public void setWorkFinished(boolean workFinished) {
        this.workFinished = workFinished;
    }

    public void writeProgram() {
        this.state.writeProgram(this);
    }

}
