package java_100_days_learning;

import java.util.Scanner;

public class PangramString {

    /*
    Problem Statement:
     In this questions you have to check input string is pangram or not means: string have character from a to z at least one time
     */

    public static void main(String[] args) {
        System.out.println("Enter Pangram string:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Entered String is a Pangram: "+ checkPangram(input));
    }

    private static boolean checkPangram(String input) {
        if(input.length() < 26){
            System.out.println(input.length());
            return false;
        }else {
            for (char i = 'a'; i <= 'z'; i++) {
                 /* The indexOf() method will character i is present in input or not
                 if it will give -1 means character is not present in input String and return false
                 other when for loops is completed then return true */

                if(input.indexOf(i) < 0){
                    System.out.println(input.charAt(i));
                    return false;
                }
            }
            return true;
        }
    }
}
