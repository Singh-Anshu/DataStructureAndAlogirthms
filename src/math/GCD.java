package math;

import java.util.Scanner;

public class GCD {

    /*
    Calculate and return GCD(Greatest Common Divisor) of two given numbers x and y.

    Note :
    Numbers should be in range of Integer.
    */

    public static void main(String[] args) {
        System.out.println("Enter Two number to get GCD");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc2.nextInt();

        System.out.println("The GCD is: "+gcd(a, b));
    }

    public static int gcd(int a,int b)
    {
        // Write your code here
        // First Way to do
       /* int gcd = 1;

        for(int i= Math.min(a,b); i>=1; i--){
            if(a % i == 0 && b % i == 0){
                gcd = i;
                break;
            }
        }*/

        // Optimal solution
        while (a >0 && b >0){

            if(a >b )
                a = a % b;
            else
                b = b % a;
        }

        if( a == 0)
            return b;
        else
            return a;

    }
}
