/*
Write a program that calculates the average of numbers divisible by 3 and 4 from 0 to the entered number using Java loops.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, sum = 0, count = 0;
        double avg;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        if (count != 0) {
            avg = (double) sum / count;
            System.out.println("Average of numbers divisible by 3 and 4: " + avg);
        } else {
            System.out.println("There are no numbers divisible by 3 and 4.");
        }
    }
}