package com.startjava.lesson_2_3.game;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name first player ");
        Player player1 = new Player(scan.next());
        System.out.println("Enter name second player ");
        Player player2 = new Player(scan.next());
        String agreement = "yes";
        while (agreement.equalsIgnoreCase("yes")) {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
            do {
                System.out.println("Do you want to continue playing? [yes/no]: ");
                agreement = scan.next();
            } while (!agreement.equalsIgnoreCase("yes") && !agreement.equalsIgnoreCase("no"));
        }
    }
}