/*
Write the GCF and LCM values of two numbers in Java using the "While Loop".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number n1: ");
        int n1 = scanner.nextInt();

        System.out.print("Please enter the number n2: ");
        int n2 = scanner.nextInt();

        int gcf = findGCF(n1, n2);
        int lcm = findLCM(n1, n2, gcf);

        System.out.println("GCF: " + gcf);
        System.out.println("LCM: " + lcm);
    }

    public static int findGCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b, int gcf) {
        return (a * b) / gcf;
    }
}
