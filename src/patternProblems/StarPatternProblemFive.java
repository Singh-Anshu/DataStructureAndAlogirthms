package patternProblems;

import java.util.Scanner;

public class StarPatternProblemFive {

    // Problem Name -> Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Triangle.
   /* output:
              *
             ***
            *****
    */

    public static void main(String[] args) {

        System.out.println("Enter Number to print star pattern");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            // print space
            for (int s = n-1; s > i; s--) {
                System.out.print(" ");
            }

            // print asterisks
            for (int j = 0; j < 2*i+1; j ++) {
                System.out.print("*");
            }

            // print space
            for (int p = n-1; p > i; p--) {
                System.out.print(" ");
            }

            System.out.println("");

        }

        System.out.println("________________________________________________________________________________");
        System.out.println();

        // Problem: -> Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the Reverse N-Star Triangle.

        for (int i = n-1; i >= 0; i--) {

            // print space
            for (int s = n-1; s > i; s--) {
                System.out.print(" ");
            }

            // print asterisks
            for (int j = 0; j < 2*i+1; j ++) {
                System.out.print("*");
            }

            // print space
            for (int p = n-1; p > i; p--) {
                System.out.print(" ");
            }

            System.out.println("");

        }
    }
}
