package com.jyy.protype;

/**
 * 简历类
 */
public class Resume implements Cloneable{

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        this.work = new WorkExperience();
    }

    // 设置个人信息
    public void setPersonalInfo(String sex,String age) {
        this.sex = sex;
        this.age =age;
    }

    // 设置工作经历
    public void setWorkExperience(String timeArea,String company) {
        this.timeArea = timeArea;
        this.company = company;
    }


    public void setWorkExperience(WorkExperience w) {
        this.work = w;
    }

    // 展示简历
    public void display() {
        System.out.println(this.name + " " + this.sex + " " + this.age);
        System.out.println("工作经历 " + this.work.getTimeArea() + " " + this.work.getCompany());
    }

    @Override
    protected Resume clone() throws CloneNotSupportedException {
        Resume object = null;
        try {
            object = (Resume) super.clone();
            object.setWorkExperience(this.work.clone());
        }catch (CloneNotSupportedException exception) {
            System.err.println("Clone异常。");
        }
        return object;
    }
}
