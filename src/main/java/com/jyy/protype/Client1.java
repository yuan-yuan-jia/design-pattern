package com.jyy.protype;

public class Client1 {

    public static void main(String[] args) {
        Resume resume1 = new Resume("大鸟");
        resume1.setPersonalInfo("男","29");
        resume1.setWorkExperience("1998-2000","xxx公司");


        Resume resume2 = new Resume("大鸟");
        resume2.setPersonalInfo("男","29");
        resume2.setWorkExperience("1998-2000","xxx公司");

        Resume resume3 = new Resume("大鸟");
        resume2.setPersonalInfo("男","29");
        resume2.setWorkExperience("1998-2000","xxx公司");


        resume1.display();
        resume2.display();
        resume3.display();

    }
}
