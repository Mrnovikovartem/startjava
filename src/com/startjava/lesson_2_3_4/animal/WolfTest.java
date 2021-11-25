package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Man");
        wolfOne.setName("Saga");
        wolfOne.setWeight(65.5f);
        wolfOne.setAge(4);
        wolfOne.setColor("Gray");

        System.out.println(wolfOne.getGender());
        System.out.println(wolfOne.getName());
        System.out.println(wolfOne.getWeight());
        System.out.println(wolfOne.getAge());
        System.out.println(wolfOne.getColor());
        System.out.println(wolfOne.walk());
        System.out.println(wolfOne.sit());
        System.out.println(wolfOne.run());
        System.out.println(wolfOne.howl());
        System.out.println(wolfOne.hunt());
    }
}