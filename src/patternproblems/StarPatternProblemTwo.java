package patternproblems;

import java.util.Scanner;

public class StarPatternProblemTwo {

    public static void main(String[] args) {

        System.out.println("Enter Number to print star pattern");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i <= n; i++){

            for (int k=1; k <= (i -1) ; k++ ) {
                System.out.print(" ");
            }

            for(int j=1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }


        System.out.println("_______________________________________________________________________________");

       for(int i=1 ; i<=n ; i++) {

           for (int j = 1; j < i; j++) {
               System.out.print(" ");
           }

           for (int k = 1; k <= n; k++) {
               System.out.print("* ");
           }
           System.out.println("");
       }
    }
}
