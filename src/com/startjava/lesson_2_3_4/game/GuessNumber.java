package com.startjava.lesson_2_3_4.game;
import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {
    private int compareNumbers;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        int min = 0;
        int max = 100;
        compareNumbers = min + (int) (Math.random() * max); 
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number first player");
            player1.setNumber(scan.nextInt());
            if (getGameResult(player1)) {
                break;
            }
            System.out.println("Enter number second player");
            player2.setNumber(scan.nextInt());
            if (getGameResult(player2)) {
                break;
            }
        }
    }

    public boolean getGameResult(Player player) {
        if (compareNumbers != player.getNumber()) {
            if (compareNumbers < player.getNumber()) {
                System.out.println("The entered number is larger than the expected one");
            } else if (compareNumbers > player.getNumber()) {
                System.out.println("The number entered is less than expected");
            }
            return false;
        }
        System.out.println("Congratulations " + player.getName());
        return true; 
    }
}