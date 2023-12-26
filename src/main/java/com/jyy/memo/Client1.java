package com.jyy.memo;

public class Client1 {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("On");
        o.show();

        Caretaker c = new Caretaker();
        // 保存状态时，由于有了很好的封装，可以
        // 可以隐藏Originator的实现细节
        c.setMemento(o.createMemento());

        //Originator 改变了状态属性为"Off"
        o.setState("off");
        o.show();

        // 恢复原初始状态
        o.recoveryMemento(c.getMemento());
        o.show();


    }
}
