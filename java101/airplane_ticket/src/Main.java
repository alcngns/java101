/*
Create a program in Java that calculates flight ticket prices according to distance and conditions.
Get Distance (KM), age and trip type (One Way, Round Trip) from the user. Get the price per distance as 0.10 TL / km.
First, calculate the total price of the flight and then apply the following discounts to the customer according to the conditions;

The values received from the user must be valid (distance and age values must be positive numbers, trip type must be 1 or 2).
Otherwise, the user will be told "You Entered Incorrect Data!" A warning should be given.
If the person is under 12 years old, a 50% discount is applied to the ticket price.
If the person is between the ages of 12-24, a 10% discount is applied to the ticket price.
If the person is over 65 years old, a 30% discount is applied on the ticket price.
If the person has selected the "Trip Type" round trip, a 20% discount is applied on the ticket price.
 */

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int  age, tripType;
        double ageDiscount = 0, typeDiscount = 0, distance, newPrice, normalPrice, newPrice2;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the distance in km: ");
        distance = input.nextDouble();
        if (distance < 0) {
            System.out.println("You entered the distance information incorrectly. Please try again.");
            return;
        } else {
            System.out.println("Total distance is: " + distance);
        }
        System.out.print("Please enter the age: ");
        age = input.nextInt();
        if (age < 0) {
            System.out.println("You entered the age information incorrectly. Please try again.");
            return;
        } else {
            System.out.println("Age is: " + age);
        }

        System.out.print("Please choice the trip type. Select 1 for single direction, 2 for double direction: ");
        tripType = input.nextInt();
        switch (tripType) {
            case 1:
                System.out.println("Trip type is: " + tripType);
                break;
            case 2:
                System.out.println("Trip type is: " + tripType);
                break;
            default:
                System.out.println("You entered the wrong value");
                return;
        }

        normalPrice = 0.10 * distance;
        System.out.println("Normal amount of your ticket is: " + normalPrice + "TL");

        if (age < 12) {
            ageDiscount = normalPrice * 0.50;
            System.out.println("Total price with age discount is: " + ageDiscount + "TL");
        } else if (age >= 12 && age <= 24) {
            ageDiscount = normalPrice * 0.10;
            System.out.println("Total price with age discount is: " + ageDiscount + "TL");
        } else if (age > 65) {
            ageDiscount = normalPrice * 0.30;
            System.out.println("Total price with age discount is: " + ageDiscount + "TL");
        }

        newPrice = normalPrice - ageDiscount;
        System.out.println("Your discounted ticket price is: " + newPrice + "TL");

        if (tripType == 2) {
            typeDiscount = newPrice * 0.20;
            System.out.println("Discount amount applied according to trip type is: " + typeDiscount);
        }
        if (tripType == 2) {
            newPrice2 = (newPrice - typeDiscount) * 2;
            System.out.println("Total price including all discounts is: " + newPrice2 + "TL");
        } else {
            System.out.println("Total price including all discounts is: " + newPrice + "TL");
        }







    }
}