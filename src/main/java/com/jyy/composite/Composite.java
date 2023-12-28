package com.jyy.composite;

import java.util.ArrayList;

public class Composite extends Component {

    private ArrayList<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        // 显示其枝节点名称
        for(int i = 0;i < depth;i++) {
            System.out.print("-");
        }
        // 对其下级进行遍历
        for (Component child : children) {
            child.display(depth + 2);
        }
    }
}
