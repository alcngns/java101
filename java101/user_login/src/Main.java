/*
If the password is incorrect, ask the user whether to reset his password.
If the user wants to reset it, check that the new password he entered should not be the same as the forgotten password.
If the passwords are the same, "Your new password cannot be the same as your old one."
If there is no problem, write the program that says "Password created".
 */

//Let username be java and password be 123

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName = "java", password = "123", newPassword;
        char check;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the username : ");
        userName = input.nextLine();
        System.out.print("Please enter the password : ");
        password = input.nextLine();

        if (password.equals("123") && userName.equals("java")) {
            System.out.println("You have successfully logged in to the system");
        } else if (!password.equals("123")) {
            System.out.println("You entered the wrong password");
            System.out.println("Do you want to reset the password");
            System.out.println("If you want enter Y, if you do not want enter N.");
            check = input.nextLine().charAt(0);
            if (check == 'N') {
                System.out.println("New password will not be created");
            } else if (check == 'Y') {
                System.out.print("Please enter the new password : ");
                newPassword = input.nextLine();
                if (newPassword.equals("123")) {
                    System.out.println("Your new password cannot be the same as your old one. Please enter another password.");
                } else {
                    System.out.println("Password created.");
                }
            }
        }


    }
}