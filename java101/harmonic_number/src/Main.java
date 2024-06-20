/*
We will write a program in Java to find the harmonic series of the entered number.
Harmonic Series Formula: 1 + (1/2) + (1/3) + (1/4) +....+ (1/n)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number n: ");
        int n = input.nextInt();
        double result = 0;
        double i = 1;


        while (i <= n) {
            result += (1 / i);
            i++;

        }
        String msg = String.format("Sum of the harmonic series according to the entered value: %f", result);
        System.out.println(msg);


    }
}