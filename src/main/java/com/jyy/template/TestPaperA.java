package com.jyy.template;

public class TestPaperA extends TestPaper {

    @Override
    public void testQuestion1() {
        super.testQuestion1();
        System.out.println("答案: b");
    }

    @Override
    public void testQuestion2() {
        super.testQuestion2();
        System.out.println("答案: a");
    }

    @Override
    public void testQuestion3() {
        super.testQuestion3();
        System.out.println("答案: c");
    }
}
