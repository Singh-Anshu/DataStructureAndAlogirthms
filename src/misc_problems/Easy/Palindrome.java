package misc_problems.Easy;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        // For Strings
        System.out.println("Enter Palindrome Letter");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

         String reverseStr = "";

        int strLength = input.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + input.charAt(i);
        }

        if (input.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(input + " is a Palindrome String.");
        }
        else {
            System.out.println(input + " is not a Palindrome String.");
        }

        // For Numbers
        /*System.out.println("Enter palindrome number");
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int rem, rev= 0, temp;
        // user defined number to be checked for palindrome

        temp = n;

        // reversed integer is stored in variable
        while( n != 0 )
        {
            rem= n % 10;
            System.out.println("rem is:" + rem);
            rev= rev * 10 + rem;
            System.out.println("rev is:" + rev);
            n=n/10;
            System.out.println("n is:" + n);

        }

        // palindrome if orignalInteger(temp) and reversedInteger(rev) are equal
        if (temp == rev)
            System.out.println(temp + " is a palindrome.");
        else
            System.out.println(temp + " is not a palindrome.");*/

    }
}
