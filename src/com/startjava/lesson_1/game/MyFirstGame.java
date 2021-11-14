package com.startjava.lesson_1.game;
import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter guessed number");
        int number  = scan.nextInt();
        System.out.println("Guess The Number");
        int expectedNumber = 0;

        while (expectedNumber != number) {
            expectedNumber = scan.nextInt();
            if (expectedNumber < number) {
                System.out.println("The entered number is less than the expected one");
            } else if (expectedNumber > number) {
                System.out.println("The number entered is larger than expected");
            }
        }
        System.out.println("Congratulations");
    }
}