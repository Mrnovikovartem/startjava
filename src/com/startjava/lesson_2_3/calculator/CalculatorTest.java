package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String agreement = "yes";
        float num1;
        float num2;
        char mathSign;
        while (agreement.equalsIgnoreCase("yes")) {
            System.out.println("Enter the first number ");
            num1 = scan.nextFloat();
            System.out.println("Enter operation operation (+, -, *, /, ^, % )");
            mathSign = scan.next().charAt(0);
            System.out.println("Enter the second number ");
            num2 = scan.nextFloat();
            Calculator calculator = new Calculator(num1, num2, mathSign);
            calculator.calculate();
            System.out.println(calculator.getResult());
            do {
                System.out.println("Do you want to continue computing? [yes/no]: ");
                agreement = scan.next();
            } while (!agreement.equalsIgnoreCase("yes") && !agreement.equalsIgnoreCase("no"));
        }
    }
}
