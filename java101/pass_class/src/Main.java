/*
Write a program that calculates the user's class passing status based on their grades using java conditional expressions.
If the course grades entered are not between 0 and 100, they are not included in the average.
Passing score: 55
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, phy, che, tur, mus;
        double avg;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your math grade: ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100){
            System.out.println("Your grade must be between 0 and 100");
            mat = 0;
        }

        System.out.print("Please enter your physical grade: ");
        phy = input.nextInt();
        if (phy < 0 || phy > 100){
            System.out.println("Your grade must be between 0 and 100");
            phy = 0;
        }

        System.out.print("Please enter your chemical grade: ");
        che = input.nextInt();
        if (che < 0 || che > 100){
            System.out.println("Your grade must be between 0 and 100");
            che = 0;
        }

        System.out.print("Please enter your Turkis grade: ");
        tur = input.nextInt();
        if (tur < 0 || tur > 100){
            System.out.println("Your grade must be between 0 and 100");
            tur = 0;
        }

        System.out.print("Please enter your music grade: ");
        mus = input.nextInt();
        if (mus < 0 || mus > 100){
            System.out.println("Your grade must be between 0 and 100");
            mus = 0;
        }

        avg = (mat + phy + che + tur + mus) / 5;

        if (avg < 55){
            System.out.println("You didn't pass the class");
        }else {
            System.out.println("You passed the class");
        }

        System.out.println("Your average is: " + avg);


    }
}


