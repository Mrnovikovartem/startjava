package com.startjava.lesson_2_3_4.calculator;
import java.util.Arrays;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String agreement = "yes";
        while (agreement.equalsIgnoreCase("yes")) {
            System.out.println("Введите математическое выражение вида: 2 ^ 10");
            System.out.println("Доступные математические операторы (+, -, *, /, ^, %, max )");
            String text = scan.nextLine();
            String[] mathExpression = text.split(" ");

            float num1 = Float.parseFloat(mathExpression[0]);
            float num2 = Float.parseFloat(mathExpression[2]);
            char mathSign = mathExpression[1].charAt(0);

            Calculator calculator = new Calculator(num1, num2, mathSign);
            calculator.calculate();

            System.out.println(calculator.getResult());
            do {
                System.out.println("Do you want to continue computing? [yes/no]: ");
                agreement = scan.nextLine();
            } while (!agreement.equalsIgnoreCase("yes") && !agreement.equalsIgnoreCase("no"));
        }
    }
}
