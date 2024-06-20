/*
Create a program in Java that calculates exponents with the values entered by the user using the "For Loop".
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, k;
        int total = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to be the base: ");
        n = scan.nextInt();
        System.out.print("Enter the number to be the exponent: ");
        k = scan.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println("Result(n^k): " + total);

    }
}