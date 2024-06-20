/*
Write a program in Java that calculates the VAT price
and VAT amount of the money received from the user and prints it on the screen.
If the entered amount is between 0 and 1000 TL,
write a program that calculates the VAT amount as 18%,
and if the amount is greater than 1000 TL, the VAT rate is 8%.
*/

import java.util.Scanner;

public class tax_calculation {
    public static void main(String[] args) {

        double amount, taxRatio = 0.18, taxRatio2 = 0.08, vatAmount, amountWvat;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the amount: ");
        amount = input.nextDouble();
        if (amount > 0 && amount <= 1000){
            vatAmount = amount * taxRatio;
            amountWvat = amount + vatAmount;
        } else if (amount > 1000) {
            vatAmount = amount * taxRatio2;
            amountWvat = amount + vatAmount;
        }else {
            System.out.println("You entered an invalid value");
            return;
        }


        System.out.println("Amount without VAT: " + amount);
        if (amount > 0 && amount <= 1000){
            System.out.println("Tax Ratio: " + taxRatio);
        }else {
            System.out.println("Tax Ratio: " + taxRatio2);
        }
        System.out.println("VAT Amount: " + vatAmount);
        System.out.println("Amount with VAT: " + amountWvat);





    }
}