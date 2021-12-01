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
        Arrays.fill(player1.arrayPlayer, 0);
        Arrays.fill(player2.arrayPlayer, 0);
        Scanner scan = new Scanner(System.in);
        int tryCount = player1.arrayPlayer.length - 1;
        for (int i = 0; i <= tryCount; i++) {
            System.out.println("Игрок 1 введите число");
            player1.arrayPlayer[i] = scan.nextInt();
            player1.setApproach(i);
            if (!getGameResult(compareNumbers, player1)) {
                printAnswers();
                break;
            }
            if (i == tryCount) {
                System.out.println("У игрока " + player1.getName() + " кончились попытки");
            }
            System.out.println("Игрок 2 введите число");
            player2.arrayPlayer[i] = scan.nextInt();
            player2.setApproach(i);
            if (!getGameResult(compareNumbers, player2)) {
                printAnswers();
                break;
            }
            if (i == tryCount) {
                System.out.println("У игрока " + player2.getName() + " кончились попытки");
            }
        }
    }

    public boolean getGameResult(int compareNumbers, Player player) {
        if (compareNumbers != player.arrayPlayer[player.getApproach()]) {
            if (compareNumbers < player.arrayPlayer[player.getApproach()]) {
                System.out.println("Введенное число больше ожидаемого");
            } else if (compareNumbers > player.arrayPlayer[player.getApproach()]) {
                System.out.println("Введенное число меньше ожидаемого");
            }
            return true;
        }
        System.out.println("Игрок " + player.getName() + " угадал число " + compareNumbers + " с " + (player.getApproachForPrint()) + "ой");
        return false;
    }

    public void printAnswers() {
        int[] array1 = Arrays.copyOfRange(player1.arrayPlayer, 0, player1.getApproachForPrint());
        int[] array2 = Arrays.copyOfRange(player2.arrayPlayer, 0, player2.getApproachForPrint());
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}