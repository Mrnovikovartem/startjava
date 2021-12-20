package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя игрока 1 ");
        Player player1 = new Player(scan.next());
        System.out.println("Введите имя игрока 2 ");
        Player player2 = new Player(scan.next());
        System.out.println("У каждого игрока по 10 попыток");
        String isNext = "yes";

        do {
            if ("yes".equals(isNext)) {
                GuessNumber game = new GuessNumber(player1, player2);
                game.start();
            }
            System.out.println("Хотите продолжить игру [yes/no]: ");
            isNext = scan.next();
        } while (!isNext.equalsIgnoreCase("no"));
    }

}
