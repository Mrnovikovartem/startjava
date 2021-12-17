package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private final int[] answers = new int[10];
    private final String name;
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public int[] getAnswers() {
        return Arrays.copyOfRange(answers, 0,attempt+1);
    }

    public String getName() {
        return name;
    }

    public int getAttempt() { return attempt; }

    public void setAttempt(int attempt) { this.attempt = attempt; }

    public void clearAnswers() {
        Arrays.fill(answers,0,attempt, 0);
    }

    public void addAnswer(int answer, int attempt) { this.answers[attempt] = answer; }
}
