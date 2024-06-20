/*
We write a program using Java loops that accepts input from the user until a single number is entered,
and collects even numbers and multiples of 4 from the entered values and prints them on the screen.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        int total = 0;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Please enter the number: ");
            n = scan.nextInt();
            if ( n % 2 == 0 && n % 4 == 0) {
                total += n;
            }

        } while (n % 2 != 1);

        System.out.println(total);


    }
}