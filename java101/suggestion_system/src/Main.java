/*
Conditions:

Suggest "Skiing" if the temperature is less than 5 degrees.
If the temperature is between 5 and 15 degrees, suggest the "Cinema" activity.
If the temperature is between 15 and 25 degrees, suggest the "Picnic" activity.
If the temperature is greater than 25 degrees, recommend the "Swimming" activity.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the temperature value");
        System.out.print("Temperature value is: ");
        heat = inp.nextInt();

        if (heat < 5){
            System.out.println("You can do ski");
        } else if (heat >=5 && heat < 15) {
            System.out.println("You can go to the cinema");
        } else if (heat == 15) {
            System.out.println("You can go on a picnic or you can go to the cinema. The choice is yours.");
        } else if (heat > 15 && heat <= 25) {
            System.out.println("You can go on a picnic.");
        }else {
            System.out.println("You can swim");
        }
    }
}