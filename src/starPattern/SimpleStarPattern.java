package starPattern;

import java.util.Scanner;

public class SimpleStarPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       /* for(int i=1; i <= n; i++){

            for (int k=1; k <= (i -1) ; k++ ) {
                System.out.print(" ");
            }

            for(int j=1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }*/

        for (int i = 0; i  <  n; i++) {
            // Print spaces
            for (int j = n - 1; j  >  i; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 0; k  <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
