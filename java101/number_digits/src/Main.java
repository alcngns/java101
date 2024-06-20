/*
Write a program that calculates the sum of the digits of a number.

Example: 1643 = 1 + 6 + 4 + 3 = 14
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, sum = 0;

        // Get a number from the user
        System.out.print("Enter a number: ");
        number = scanner.nextInt();


        // Continue as long as the number is not zero
        while (number != 0) {
            // Get the last digit of the number
            int digit = number % 10;
            // Add this digit to the sum
            sum += digit;
            // Remove the last digit from the number
            number /= 10;
        }

        // Print the result
        System.out.println("Sum of the digits: " + sum);


    }
}
