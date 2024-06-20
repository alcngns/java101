/*
Write a program in Java that prints the total amount of the products purchased by users
from the grocery store according to their kilogram values.

Fruits and KG Prices

Pear: 2.14 TL
Apple: 3.67 TL
Tomato: 1.11 TL
Banana: 0.95 TL
Eggplant: 5.00 TL
 */

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5;
        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;
        double totalPrice;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter how many kg of pears you purchased: ");
        pearKg = input.nextDouble();
        System.out.print("Please enter how many kg of apple you purchased: ");
        appleKg = input.nextDouble();
        System.out.print("Please enter how many kg of tomato you purchased: ");
        tomatoKg = input.nextDouble();
        System.out.print("Please enter how many kg of banana you purchased: ");
        bananaKg = input.nextDouble();
        System.out.print("Please enter how many kg of eggplant you purchased: ");
        eggplantKg = input.nextDouble();

        totalPrice = (pear * pearKg) + (appleKg * apple) + (tomato * tomatoKg) + (banana * bananaKg) + (eggplant * eggplantKg);
        System.out.println("Total amount is: " + totalPrice);





    }
}