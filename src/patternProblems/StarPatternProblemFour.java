package patternProblems;

import java.io.OutputStream;
import java.util.Scanner;

public class StarPatternProblemFour {

    public static void main(String[] args) {

        System.out.println("Enter Number to print star pattern");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i=1; i<=n; i++){

            for(int j=n; j>=i; j--){

                System.out.print("* ");
            }

            System.out.println("");
        }


        /*  OutPut:
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        System.out.println("____________________________________________________________");


        for(int i=1; i<=n; i++){
            int num = 1;
            for(int j=n; j>=i; j--){

                System.out.print(num+" ");
                num++;
              //  System.out.print(j+" ");
            }

            System.out.println("");
        }

        /*  OutPut:
         1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2
         1
         */

    }
}
