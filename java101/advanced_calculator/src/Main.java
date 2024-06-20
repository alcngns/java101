/*
We create a calculator in Java that performs operations selected by the user.
 */

import java.util.Scanner;

public class Main {
    static void sum(int a, int b) {
        int result = a + b;
        System.out.println("Result is: " + result);
    }

    static void minus(int a, int b) {
        int result = a - b;
        System.out.println("Result is: " + result);
    }

    static void product(int a, int b) {
        int result = a * b;
        System.out.println("Result is: " + result);
    }

    static void divide(int a, int b, Scanner scanner) {
        int result = a / b;
        while (b == 0) {
            System.out.println("Divisor number must be non-zero. Please enter the new value.");
            b = scanner.nextInt();
        }
        System.out.println("Result is: " + result);
    }

    static void power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Result is: " + result);
    }

    static void mod(int a, int b) {
        int result = a % b;
        System.out.println("Result is: " + result);
    }

    static void rectangle(int a, int b) {
        int environment = 2 * (a + b);
        int area = a * b;
        System.out.println("Area of rectangle is: " + area);
        System.out.println("Environment of rectangle is: " + environment);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Finding exponents\n"
                + "6- Mode\n"
                + "7- Rectangular area and perimeter\n"
                + "0- Exit";
        System.out.println(menu);
        while (true) {

            System.out.print("Please choose an action: ");
            select = scanner.nextInt();
            if (select == 0) {
                break;
            }

            System.out.print("Please enter the first number: ");
            int a = scanner.nextInt();
            System.out.print("Please enter the second number: ");
            int b = scanner.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;

                case 2:
                    minus(a, b);
                    break;

                case 3:
                    product(a, b);
                    break;

                case 4:
                    divide(a, b, scanner);
                    break;

                case 5:
                    power(a, b);
                    break;

                case 6:
                    mod(a, b);
                    break;

                case 7:
                    rectangle(a, b);
                    break;

                default:
                    System.out.println("You entered the wrong choose. Please try again.");
            }

        }
        System.out.println("You logged out.");


    }
}