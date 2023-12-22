package com.jyy.abstractfactory;

public class AccessUser implements IUser{


    // 新增一个用户
    @Override
    public void insert(User user) {
        System.out.println("在Access 中给User表增加一条记录");
    }


    //获取一个用户信息
    @Override
    public User getUser(int id) {
        System.out.println("在Access中根据用户ID得到User表一条记录");
        return null;
    }

}
