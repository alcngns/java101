/*
Write a program to calculate combinations in Java.

Combination formula
C(n,r) = n! / (r! * (n-r)!)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, r, result;
        int total = 1, total2 = 1, total3 = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        n = inp.nextInt();
        System.out.print("Please enter second number: ");
        r = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            total = total * i;
        }

        for (int j = 1; j <= r; j++) {
            total2 = total2 * j;
        }

        for (int p = 1; p <= (n - r); p++) {
            total3 = total3 * p;

        }
        result = total / (total2 * total3);
        System.out.println("C(n,r): " + result);
    }
}