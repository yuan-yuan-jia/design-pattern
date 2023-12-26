package com.jyy.memo;

public class Client2 {

    public static void main(String[] args) {
        // 大战Boss前
        GameRole role = new GameRole();
        role.getInitState();
        role.displayState();


        //保存进度
        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemento(role.saveState());

        // 大战Boss时，损耗严重
        role.fight();
        // 显示状态
        role.displayState();

        // 游戏进度恢复
        role.recoveryState(stateAdmin.getMemento());

        // 显示状态
        role.displayState();
    }
}
