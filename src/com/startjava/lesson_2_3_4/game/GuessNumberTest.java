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
        String agreement = "yes";
        while (agreement.equalsIgnoreCase("yes")) {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
            do {
                System.out.println("Хотите продолжить игру [yes/no]: ");
                agreement = scan.next();
            } while (!agreement.equalsIgnoreCase("yes") && !agreement.equalsIgnoreCase("no"));
        }
    }
}
