/*
We are writing a program in Java that detects whether the word entered by the user is "Palindromic" or not.
 */


public class Main {

    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                return true;
            }
            i++;
            j--;
        }

        return false;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("asa"));
        System.out.println(isPalindrome2("asya"));

    }
}