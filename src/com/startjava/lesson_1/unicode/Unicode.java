package com.startjava.lesson_1.unicode;

public class Unicode {
    public static void main(String[] args) {
        for (int i = 33; i < 126; i++) {
            //String symbol = Character.toString((char)i);
            System.out.println(Character.toString((char)i));
        }
    }
}