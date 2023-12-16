package com.jyy.protype;

public class Client3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume("大鸟");
        resume.setPersonalInfo("男","29");
        resume.setWorkExperience("1998-2000","xxx公司");

        Resume resume1 = resume.clone();
        resume.display();
        resume1.display();
    }
}
