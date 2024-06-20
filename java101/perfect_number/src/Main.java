/*
It detects whether a number entered from the keyboard is a perfect number or not,
and if the number is a perfect number, "it is a perfect number" is displayed on the screen.
If not, “it is not the perfect number.” Write a program in Java language that writes the expressions to the screen.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Please enter a positive number: ");
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("The number must be positive. Please try again.");
            }
        } while (number <= 0);

        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (total == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
