package com.jyy.composite;

public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("Cannot add component to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        // 叶节点的具体显示方法，此处是显示其名称和级别
        for (int i = 0;i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}
