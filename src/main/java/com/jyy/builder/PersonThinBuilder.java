package com.jyy.builder;

import java.awt.*;

// 瘦小人建造者
public class PersonThinBuilder  extends PersonBuilder {



    public PersonThinBuilder(Graphics g) {
        super(g);
    }

    @Override
    public void buildHead() {
        // 头
        g.drawOval(150,120,30,30);

    }

    @Override
    public void buildBody() {
        g.drawRect(160,150,10,50);
    }



    @Override
    public void buildArmLeft() {
        g.drawLine(160,150,140,200);
    }

    @Override
    public void buildArmRight() {
        g.drawLine(170,150,190,200);
    }

    @Override
    public void buildLegLeft() {
        g.drawLine(160,200,145,250);
    }

    @Override
    public void buildLegRight() {
        g.drawLine(170,200,185,250);
    }
}
