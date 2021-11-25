package com.startjava.lesson_2_3_4.robot;
import java.util.Scanner;

public class JagerTest {
    public static void main(String[] args) {
        Jager jagerOne = new Jager();
        Jager jagerTwo = new Jager();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter model name fist Jager ");
        jagerOne.setModelName(scan.next());
        System.out.println("Enter mark fist Jager ");
        jagerOne.setMark(scan.next());
        System.out.println("Enter origin fist Jager ");
        jagerOne.setOrigin(scan.next());
        System.out.println("Enter height fist Jager ");
        jagerOne.setHeight(scan.nextFloat());
        System.out.println("Enter weight fist Jager ");
        jagerOne.setWeight(scan.nextFloat());
        System.out.println("Enter speed fist Jager ");
        jagerOne.setSpeed(scan.nextInt());
        System.out.println("Enter strenght fist Jager ");
        jagerOne.setStrenght(scan.nextInt());
        System.out.println("Enter armor fist Jager ");
        jagerOne.setArmor(scan.nextInt());
        System.out.println("Jager " + jagerOne.getModelName() + " is ready");

        System.out.println("Enter model name second Jager ");
        jagerTwo.setModelName(scan.next());
        System.out.println("Enter mark fist Jager ");
        jagerTwo.setMark(scan.next());
        System.out.println("Enter origin fist Jager ");
        jagerTwo.setOrigin(scan.next());
        System.out.println("Enter height fist Jager ");
        jagerTwo.setHeight(scan.nextFloat());
        System.out.println("Enter weight fist Jager ");
        jagerTwo.setWeight(scan.nextFloat());
        System.out.println("Enter speed fist Jager ");
        jagerTwo.setSpeed(scan.nextInt());
        System.out.println("Enter strenght fist Jager ");
        jagerTwo.setStrenght(scan.nextInt());
        System.out.println("Enter armor fist Jager ");
        jagerTwo.setArmor(scan.nextInt());
        System.out.println("Jager " + jagerTwo.getModelName() + " is ready");

        System.out.println("modelName = " + jagerOne.getModelName());
        System.out.println("mark = " + jagerOne.getMark());
        System.out.println("origin = " + jagerOne.getOrigin());
        System.out.println("height = " + jagerOne.getHeight());
        System.out.println("weight = " + jagerOne.getWeight());
        System.out.println("speed = " + jagerOne.getSpeed());
        System.out.println("strenght = " + jagerOne.getStrenght());
        System.out.println("armor = " + jagerOne.getArmor());

        System.out.println("modelName = " + jagerTwo.getModelName());
        System.out.println("mark = " + jagerTwo.getMark());
        System.out.println("origin = " + jagerTwo.getOrigin());
        System.out.println("height = " + jagerTwo.getHeight());
        System.out.println("weight = " + jagerTwo.getWeight());
        System.out.println("speed = " + jagerTwo.getSpeed());
        System.out.println("strenght = " + jagerTwo.getStrenght());
        System.out.println("armor = " + jagerTwo.getArmor());
    }
}