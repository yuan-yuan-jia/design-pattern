package com.jyy.abstractfactory;

public class Client1 {

    public static void main(String[] args) {

        User user = new User();
        Department department = new Department();
        IFactory factory = new SqlServerFactory();
        IUser iu = factory.createUser();
        iu.insert(user); // 新增一个用户
        iu.getUser(1); // 得到用户ID为1的用户信息


        IDepartment iDepartment = factory.createDepartment();
        iDepartment.insert(department);
        iDepartment.getDepartment(2);
    }
}
