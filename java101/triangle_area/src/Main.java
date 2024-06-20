/*
Write a program that calculates the area of a triangle whose three side lengths are given by the user.
 */
import java.awt.geom.Area;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Let's define the side lengths
        int a, b, c;
        double u;
        double triangleArea;

        System.out.println("Please enter lenghts");
        Scanner length = new Scanner(System.in);
        System.out.print("Enter first length: ");
        a = length.nextInt();
        System.out.print("Enter second length: ");
        b = length.nextInt();
        System.out.print("Enter third lenght: ");
        c = length.nextInt();

        u = (a + b + c) / 2;
        triangleArea= Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Triangle area is: " + triangleArea);



    }
}