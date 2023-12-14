package com.jyy.wrappattern;

/**
 * 服饰抽象类
 */
public  class Finery implements ICharacter{

    protected ICharacter component;

    public void decorate(ICharacter component) {
        this.component = component;
    }


    public void show() {
        if (this.component != null) {
            this.component.show();
        }
    }
}
