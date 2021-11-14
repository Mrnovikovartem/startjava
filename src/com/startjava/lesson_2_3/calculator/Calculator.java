package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private float num1;
    private float num2;
    private char mathSign;
    private float result;

    public Calculator(float num1, float num2, char mathSign) {
        this.num1 = num1;
        this.num2 = num2;
        this.mathSign = mathSign;
    }

    public void calculate() {
        switch (mathSign) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
                break;
            case '%' :
                result = num1 % num2;
                break;
            case '^' :
                result = num1;
                for(int i = 1; i < num2; i++) {
                    result *= num1;
                }
                break;
            default :
                System.out.println("Invalid values");
        }
    }

    public float getResult() {
        return result;
    }
}