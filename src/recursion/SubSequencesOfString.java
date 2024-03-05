package recursion;

import java.util.Scanner;

public class SubSequencesOfString {
    /*
    *
    * Problem Statement: Printing al subsequences of string in linear manner
     */

    public static void main(String[] args) {

        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        printAllSubSequences(str, 0, "");
        sc.close();
    }

    // abc

    private static void printAllSubSequences(String str, int index, String newString) {

        if(index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);
        printAllSubSequences(str, index+1, newString+currChar);

        printAllSubSequences(str, index+1, newString);


    }
}
