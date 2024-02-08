package patternproblems;

import java.util.Scanner;

public class StarPatternProblemThree {

    public static void main(String[] args) {

        System.out.println("Enter Number to print star pattern");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j+" ");
            }

            System.out.println("");
        }

        System.out.println("____________________________________________________________");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(i+" ");
            }

            System.out.println("");
        }
    }
}
