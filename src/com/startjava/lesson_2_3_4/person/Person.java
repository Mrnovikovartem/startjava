package com.startjava.lesson_2_3_4.person;

public class Person {
    String gender = "Man";
    String name = "Ivan";
    float height = 1.8f;
    float weight = 85.5f;
    int age = 25;

    void walk() {
        System.out.println("walking");
    }

    boolean sit() {
        return true;
    }

    void run() {
        System.out.println("running");
    }

    String say() {
        return "Hey";
    }

    boolean learnJava() {
        return true;
    }
}
