package com.startjava.lesson_2_3_4.game;

public class Player {
    public int[] arrayPlayer = new int[10];
    private String name;
    private int approach;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getApproach() {
        return approach;
    }

    public void setApproach(int approach) {
        this.approach = approach;
    }

    public int getApproachForPrint() {
        return approach + 1;
    }
}
