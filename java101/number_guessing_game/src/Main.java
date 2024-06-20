/*
We are making a "Number Guessing Game" in Java where we ask the user to guess a number that the program randomly chooses between 0-100.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        int number = rnd.nextInt(100);
        //int number = (int)(Math.random() * 100);

        Scanner scanner = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;

        while (right < 5) {
            System.out.print("Please enter your guess: ");
            selected = scanner.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a value between 0-100");
                continue;
            }
            if (selected == number) {
                System.out.println("Congratulations. Your guess is right. Number is: " + selected);
                isWin = true;
                break;
            } else {

                System.out.println("You guessed wrong!");
                if (selected > number) {
                    System.out.println("Your guess is greater than the secret number.");
                } else {
                    System.out.println("Your guess is smaller than the secret number.");
                }
                wrong[right++] = selected;
                System.out.println("Your remaining guess is  " + (5 - right));
            }

        }
        if (!isWin) {
            System.out.println("Your lost!");
            System.out.println("Your predictions: " + Arrays.toString(wrong));
        }


    }
}