package com.jyy.simplefactory;

public class Operation {

    public static double getResult(double numberA,double numberB,String operator) {
            double result = 0d;
            switch (operator) {
                case "+":
                    result = numberA + numberB;
                    break;
                case "-":
                    result = numberA - numberB;
                    break;
                case "*":
                    result = numberA * numberB;
                    break;
                case "/":
                    result = numberA / numberB;
                    break;
                case "sqrt":
                default:
            }
            return result;
    }

}
