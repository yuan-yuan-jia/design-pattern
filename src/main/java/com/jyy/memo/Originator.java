package com.jyy.memo;

public class Originator {


    // 状态
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }



    // 显示数据
    public void show() {
        System.out.println("State: " + this.state);
    }

    // 创建备忘录
    public Memento createMemento() {
        return new Memento(this.state);
    }


    // 恢复备忘录
    public void recoveryMemento(Memento memento) {
        this.setState(memento.getState());
    }


}
