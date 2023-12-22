package com.jyy.abstractfactory;

public class AccessDepartment implements IDepartment{
    @Override
    public void insert(Department department) {
        System.out.println("在Access中给Department表新增一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在Access中根据部门ID得到Department表一条记录");
        return null;
    }
}
