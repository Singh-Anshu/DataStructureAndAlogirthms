package patternProblems;

import java.util.Scanner;

public class StarPatternProblemSeven {

    /*   Problem statement
        Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Rotated Triangle.
        */

    public static void main(String[] args) {
        System.out.println("Enter Number to print star pattern");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();



        for(int i=n; i > 1; i--){

            for(int j=n; j>=i; j--){

                System.out.print("* ");
            }

            System.out.println("");
        }

        for(int i=1; i<=n; i++){

            for(int j=n; j>=i; j--){

                System.out.print("* ");
            }

            System.out.println("");
        }

       /* OutPut:
            *
            * *
            * * *
            * * * *
            * * * * *
            * * * *
            * * *
            * *
            *
        */
    }
}
