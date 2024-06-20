/*
Write a program in Java that finds the largest and smallest numbers among N counting numbers entered
from the keyboard and writes these numbers to the screen.
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("How many numbers will you enter? ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("You must enter at least one number.");
            return;
        }


        System.out.print("Please enter number 1: ");
        int number = scanner.nextInt();
        int max = number;
        int min = number;


        for (int i = 1; i < count; i++) {
            System.out.print("Please enter number " + (i + 1) + ": ");
            number = scanner.nextInt();

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }


        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}
