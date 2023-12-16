package com.jyy.protype;

// 工作经历类
public class WorkExperience implements Cloneable{

    // 工作时间范围
    private String timeArea;
    private String company;

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    protected WorkExperience clone() throws CloneNotSupportedException {
        WorkExperience o = null;
        try {
            o = (WorkExperience) super.clone();
        }catch (CloneNotSupportedException e) {
            System.err.println();
        }
        return o;
    }
}
