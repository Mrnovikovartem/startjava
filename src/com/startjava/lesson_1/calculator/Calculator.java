package com.startjava.lesson_1.calculator;
import java.util.Scanner;
    
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First number ");
        float num1 = scan.nextFloat();
        System.out.println("Enter operation operation (+, -, *, /, ^, % )");
        char mathSign  = scan.next().charAt(0);

        if (mathSign  != '^') {
            System.out.println("Enter the second number ");
        } else {
            System.out.println("Enter the degree of the number ");
        }
        float num2 = scan.nextFloat();

        if (mathSign == '+') {
            System.out.println(num1 + num2);
        } else if (mathSign == '-') {
            System.out.println(num1 - num2);
        } else if (mathSign == '*') {
            System.out.println(num1 * num2);
        } else if (mathSign == '/') {
            System.out.println(num1 / num2);
        } else if (mathSign == '%') {
            System.out.println(num1 % num2);
        } else if (mathSign == '^') {
            float result = num1;
            for(int i = 1; i < num2; i++) {
                result *= num1;
            }
            System.out.println(result);
        }
    }
}