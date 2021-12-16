package com.startjava.lesson_2_3_4.game;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private final int secretNumber;
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        int min = 0;
        int max = 100;
        secretNumber = min + (int) (Math.random() * max);
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        player1.clearAnswers();
        player2.clearAnswers();
        int tryCount = player1.getAnswers().length - 1;
        for (int i = 0; i <= tryCount; i++) {
            if (makeMove(player1, i, tryCount) || makeMove(player2, i, tryCount)) {
                printAnswers(player1);
                printAnswers(player2);
                break;
            }
        }
    }

    private boolean makeMove(Player player, int i, int tryCount) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " введите число");
        player.addAnswers(scan.nextInt(),i);
        player.setAttempt(i);
        if (!compareNumbers(player)) {
            return true;
        }
        if (i == tryCount) {
            System.out.println("У игрока " + player.getName() + " кончились попытки");
        }
        return false;
    }

    private boolean compareNumbers(Player player) {
        int answer = player.getAnswers()[player.getAttempt()];
        if (secretNumber != answer) {
            if (secretNumber < answer) {
                System.out.println("Введенное число больше ожидаемого");
            } else {
                System.out.println("Введенное число меньше ожидаемого");
            }
            return true;
        }
        System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber + " с " + (player.getAttempt() + 1) + "ой");
        return false;
    }

    private void printAnswers(Player player) {
        int[] resultArray = Arrays.copyOfRange(player.getAnswers(), 0, player.getAttempt() + 1);
        for (int number : resultArray) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}