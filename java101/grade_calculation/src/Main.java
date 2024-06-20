import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //create variables

        int mat, che, bio, phy;

        //defined the scanner class
        Scanner input = new Scanner(System.in);

        //get values from user
        System.out.print("Please enter your Math grade: ");
        mat = input.nextInt();

        System.out.print("Please enter your Chemistry grade: ");
        che = input.nextInt();

        System.out.print("Please enter your Biology grade: ");
        bio = input.nextInt();

        System.out.print("Please enter your Physical grade: ");
        phy = input.nextInt();

        int total = (mat + che + bio + phy);
        double average = total / 4.0;

        System.out.println("Average of the grades you entered is " + average);

        //Condition indicating "pass" if the average is greater than 60; fail if it is less than 60

        String result = (average > 60) ? "Congratulations, you passed the course successfully." : "Sorry, you failed the course.";
        System.out.println(result);





    }
}