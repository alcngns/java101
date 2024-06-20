/*
Write a program in Java language that uses the "Recursive" method to perform the exponentiation process whose base
and exponent values are received from the user.
 */

import java.util.Scanner;

public class Main {
    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent -1);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the base value: ");
        int base = scan.nextInt();
        System.out.print("Please enter the exponent value: ");
        int exponent = scan.nextInt();

        int result = power(base, exponent);
        System.out.println("Result is: " + result);


    }
}