/*
Create a calculator using switch-case blocks in java
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2;
        char select;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        n1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        n2 = input.nextInt();

        System.out.println("Select the action you want to take");
        System.out.println("Addition: A\nSubtraction: S\nMultiplication: M\nDivide: D");
        System.out.print("Selected action is: ");
        select = input.next().charAt(0);

        switch (select) {
            case 'A':
                System.out.println("Result: " + (n1 + n2));
                break;

            case 'S':
                System.out.println("Result: " + (n1 - n2));
                break;

            case 'M':
                System.out.println("Result: " + (n1 * n2));
                break;

            case 'D':
                if (n2 != 0){
                    System.out.println("Result: " + (n1 / n2));
                }else {
                    System.out.println("Number cannot be divided by zero");
                }
                break;
            default:
                System.out.println("You have logged in incorrectly. Please try again");


        }

    }
}