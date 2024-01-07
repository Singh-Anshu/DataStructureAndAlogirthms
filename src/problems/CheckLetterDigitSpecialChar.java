package problems;

import java.util.Scanner;

public class CheckLetterDigitSpecialChar {

    public static void main(String[] args) {
        // you code goes here
        System.out.println("Enter any Character: ");
        Scanner sc = new Scanner(System.in);

        char input = sc.next().charAt(0);

        // if-else
        if (input >= 65 && input <= 90 || input >= 97 && input <= 122) {

            System.out.println("It's Alphabet");

        } else if (input >= 48 && input <= 57) {

            System.out.println("It's Digit");

        } else {
            System.out.println("It's Special Character");
        }
    }

}
