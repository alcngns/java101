/*
Write a program in Java
that takes the number of digits from the user and draws an inverted triangle
on the screen with asterisks (*) using loops.
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int height;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the height of the triangle: ");
        height = scanner.nextInt();

        for (int i = height; i > 0; i--) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");

            }
            System.out.println();
        }


    }
}