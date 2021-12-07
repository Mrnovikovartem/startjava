package com.startjava.lesson_2_3_4.game;

import java.lang.Math;
import java.util.Arrays;
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
        Arrays.fill(player1.getAnswers(), 0);
        Arrays.fill(player2.getAnswers(), 0);
        int tryCount = player1.getAnswers().length - 1;
        for (int i = 0; i <= tryCount; i++) {
            if (isWinner(player1, i, tryCount) || isWinner(player2, i, tryCount)) {
                printAnswers(player1);
                printAnswers(player2);
                break;
            }
        }
    }

    private boolean compareNumbers(int compareNumbers, Player player) {
        if (compareNumbers != player.getAnswers()[player.getAttempt()]) {
            if (compareNumbers < player.getAnswers()[player.getAttempt()]) {
                System.out.println("Введенное число больше ожидаемого");
            } else if (compareNumbers > player.getAnswers()[player.getAttempt()]) {
                System.out.println("Введенное число меньше ожидаемого");
            }
            return true;
        }
        System.out.println("Игрок " + player.getName() + " угадал число " + compareNumbers + " с " + (player.getAttempt() + 1) + "ой");
        return false;
    }

    private void printAnswers(Player player) {
        int[] resultArray = Arrays.copyOfRange(player1.getAnswers(), 0, player.getAttempt() + 1);
        for (int x : resultArray) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private boolean isWinner(Player player, int i, int tryCount) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " введите число");
        player.getAnswers()[i] = scan.nextInt();
        player.setAttempt(i);
        if (!compareNumbers(compareNumbers, player)) {
            return true;
        }
        if (i == tryCount) {
            System.out.println("У игрока " + player.getName() + " кончились попытки");
        }
        return false;
    }
}