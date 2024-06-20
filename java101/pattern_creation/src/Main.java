/*
Write a "Recursive" method in Java language without using a loop that obeys the following rule
according to the n value received from the user.

Rule: Subtract 5 from the entered number until the entered number is 0 or negative.
Print the last value on the screen during each subtraction. After the number becomes negative or
0, add 5 again. Again, print the last value of the number to the screen with each addition.
 */

import java.util.Scanner;


public class Main {
    public static void printPattern(int current, int initial, boolean descending) {
        // Print the current value
        System.out.print(current + " ");


        if (descending) {
            if (current <= 0) {

                printPattern(current + 5, initial, false);
            } else {

                printPattern(current - 5, initial, true);
            }
        } else {

            if (current < initial) {

                printPattern(current + 5, initial, false);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int n = scanner.nextInt();


        printPattern(n, n, true);
    }


}
