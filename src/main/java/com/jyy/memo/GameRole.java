package com.jyy.memo;

public class GameRole {


    // 生命力
    private int vitality;

    // 攻击力
    private int attack;

    // 防御力
    private int defense;


    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    // 状态显示
    public void displayState() {
        System.out.println("角色当前状态: ");
        System.out.println("体力: " + this.vitality);
        System.out.println("攻击力: " + this.attack);
        System.out.println();
    }

    // 获得初始状态
    public void getInitState() {
        this.vitality = 100;
        this.attack = 100;
        this.defense = 0;
    }


    // 保存角色状态
    public RoleStateMemento saveState() {
        return new RoleStateMemento(this.vitality,this.attack,this.defense);
    }

    // 恢复角色状态
    public void recoveryState(RoleStateMemento memento) {
        this.setVitality(memento.getVitality());
        this.setAttack(memento.getAttack());
        this.setDefense(memento.getDefense());
    }


    public void fight() {
        this.vitality = 0;
        this.attack = 0;
        this.defense = 0;
    }


}
