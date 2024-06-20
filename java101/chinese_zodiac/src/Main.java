/*
Write a program in Java that takes the date of birth from the user and calculates the Chinese Zodiac value.
How to calculate Chinese Zodiac?

When calculating the Chinese zodiac, it is calculated by dividing the person's birth year by 12.

Date of Birth 12% = 0 ➜ Monkey

Date of Birth 12% = 1 ➜ Rooster

Date of Birth 12% = 2 ➜ Dog

Date of Birth 12% = 3 ➜ Pig

Date of Birth 12% = 4 ➜ Rat

Date of Birth 12% = 5 ➜ Ox

Date of Birth 12% = 6 ➜ Kaplan

Date of Birth 12% = 7 ➜ Rabbit

Date of Birth 12% = 8 ➜ Dragon

Date of Birth 12% = 9 ➜ Snake

Date of Birth 12% = 10 ➜ Horse

Date of Birth 12% = 11 ➜ Sheep
 */

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int year;

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter your birth year: ");
        year = inp.nextInt();

        switch (year % 12) {
            case 0:
                System.out.println("Your zodiac sign according to the chinese zodiac is Monkey");
                break;
            case 1:
                System.out.println("Your zodiac sign according to the chinese zodiac is Cockerel");
                break;
            case 2:
                System.out.println("Your zodiac sign according to the chinese zodiac is Dog");
                break;
            case 3:
                System.out.println("Your zodiac sign according to the chinese zodiac is Pig");
                break;
            case 4:
                System.out.println("Your zodiac sign according to the chinese zodiac is Mouse");
                break;
            case 5:
                System.out.println("Your zodiac sign according to the chinese zodiac is Ox");
                break;
            case 6:
                System.out.println("Your zodiac sign according to the chinese zodiac is Tiger");
                break;
            case 7:
                System.out.println("Your zodiac sign according to the chinese zodiac is Rabbit");
                break;
            case 8:
                System.out.println("Your zodiac sign according to the chinese zodiac is Dragon");
                break;
            case 9:
                System.out.println("Your zodiac sign according to the chinese zodiac is Snake");
                break;
            case 10:
                System.out.println("Your zodiac sign according to the chinese zodiac is Horse");
                break;
            case 11:
                System.out.println("Your zodiac sign according to the chinese zodiac is Sheep");

        }



    }
}