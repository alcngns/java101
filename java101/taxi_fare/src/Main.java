/*
Write a program in Java that prints the taximeter amount according to the distance traveled (KM).

Taximeter costs 2.20 TL per KM.
The minimum payable amount is 20 TL. For fares under 20 TL, 20 TL will still be charged.
Taximeter opening fee is 10 TL.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int startPrice = 10;
        double perKm = 2.20, total, km;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter distance: ");
        km = input.nextDouble();

        total = startPrice + (km * perKm);

        if (total <= 20){
            System.out.println("Miniumum price is 20 TL. You must pay 20 TL.");
        }else {
            System.out.println("You must pay " + total + " TL");
        }

    }
}