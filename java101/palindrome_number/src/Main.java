/*
Let's write a program in Java to find out whether a number is a "Palindrome Number" or not.
 */


public class Main {

    static String Ispalindrome(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber) {
            return "Number is a palindrome number.";
        } else {
            return "Number is not a palindrome number.";
        }

    }


    public static void main(String[] args) {
        System.out.println(Ispalindrome(101));


    }
}