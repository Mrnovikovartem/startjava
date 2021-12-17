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
        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
        } while (agreement());
    }

    public static boolean agreement() {
        String wish;
        System.out.println("Хотите продолжить игру [yes/no]: ");
        do {
            Scanner scan = new Scanner(System.in);
            wish = scan.next();
            if ((!wish.equalsIgnoreCase("yes") && !wish.equalsIgnoreCase("no")))
                System.out.println("Повторите ответ ");
        }
            while (!wish.equalsIgnoreCase("yes") && !wish.equalsIgnoreCase("no"));
                return wish.equals("yes");
        }
    }
