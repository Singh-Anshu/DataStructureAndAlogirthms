package java_100_days_learning;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateChar {

    /*
    Problem Statement:
    Remove a Duplicate character from input String
    for example:
    input: java
    output: jav

     */

    public static void main(String[] args) {
        System.out.println("Enter any duplicate String");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        printWithoutDuplicateChracaterFromString(input);
    }

    private static void printWithoutDuplicateChracaterFromString(String input) {
        char[] inputArray = input.toCharArray();

        Set<Character> charSet = new LinkedHashSet<Character>();

        for(char data : inputArray){
            charSet.add(data);
        }

        StringBuilder result = new StringBuilder();

        for(char c: charSet){
            result.append(c);
        }

        System.out.println("String without duplicate: "+ result);

    }
}
