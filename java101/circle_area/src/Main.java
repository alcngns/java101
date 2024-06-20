/*
Write a program to find the area of a circle whose radius is r and whose central angle is a.
 */

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double pi = 3.14;
        int r;
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle: ");
        r = input.nextInt();
        System.out.print("Please enter the size of the center angle of the circle: ");
        a = input.nextInt();

        double circleArea = (pi * (r * r) * a) / 360;
        System.out.println("Area of circle segment is: " + circleArea);



    }
}