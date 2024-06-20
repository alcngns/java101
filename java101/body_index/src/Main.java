/*
Get height and weight values from the user and assign them to a variable with Java.
Calculate the user's "Body Mass Index" value according to the formula below and print it on the screen.

Formula
Weight (kg) / Height (m) * Height (m)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double height, weight, body_index;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height in meters: ");
        height = input.nextDouble();
        System.out.print("Please enter your weight in kilograms: ");
        weight = input.nextDouble();

        body_index = weight / (height * height);
        System.out.println("Value of body mass index: " + body_index);
    }
}