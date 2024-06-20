/*
Sort the 3 entered numbers from smallest to largest.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;
        Scanner inp = new Scanner(System.in);

        System.out.println("Please enter the number a");
        System.out.print("Number a is: ");
        a = inp.nextInt();
        System.out.println("Please enter the number b");
        System.out.print("Number b is: ");
        b = inp.nextInt();
        System.out.println("Please enter the number c");
        System.out.print("Number c is: ");
        c = inp.nextInt();

        if (a < b && a < c) {
            if (b < c) {
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        } else if (c < a && c < b) {
            if (a < b) {
                System.out.println("c < a < b");
            } else {
                System.out.println("c < b < a");
            }

        }


    }
}