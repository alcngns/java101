/*
We are creating an ATM project where the user can manage his bank account using Java loops.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;


        while (right > 0) {
            System.out.print("Please enter your user name: ");
            userName = scanner.nextLine();
            System.out.print("Please enter your password: ");
            password = scanner.nextLine();
            if (userName.equals("alican") && password.equals("gunes123")) {
                System.out.println("Welcome. You entered the system.");
                do {
                    System.out.println("1-Deposit\n" +
                            "2-Withdraw money\n" +
                            "3-Balance inquiry\n" +
                            "4-Exit"
                    );
                    System.out.print("Please select the action to take: ");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Enter the amount you want to deposit: ");
                            int price = scanner.nextInt();
                            balance += price;
                            System.out.println("Your new balance: " + balance);
                            break;
                        case 2:
                            System.out.print("Please enter the amount you want to withdraw: ");
                            int price2 = scanner.nextInt();
                            if (price2 > balance) {
                                System.out.println("Your balance is insufficient");
                            } else {
                                balance -= price2;
                                System.out.println("Your remaining balance: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Your balance: " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("See you again. Have a good day!");
                break;
            } else {
                --right;
                System.out.println("Username or password is wrong. Please try again.");
                if (right == 0) {
                    System.out.println("Your account is blocked. Please contact to your bank.");
                } else {
                    System.out.println("your remaining entry rights: " + right);
                }
            }

        }
    }
}
