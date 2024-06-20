/*
Write a program that prints the powers of 4 and 5 up to the entered number using Java loops.
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        n = inp.nextInt();

        System.out.println("Powers of four: ");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Powers of five: ");
        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }


    }
}