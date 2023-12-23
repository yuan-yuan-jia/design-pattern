package com.jyy.state;

public class Context {

    private State state;
    public Context(State state) {
        this.state = state;

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态:" + this.state.getClass().getName());
    }

    public void request() {
        this.state.handle(this);
    }

}
