package com.startjava.lesson_2_3_4.game;

public class Player {
    private int[] answers = new int[10];
    private String name;
    private int attempt;

    public int[] getAnswers() {
        return answers;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
}
