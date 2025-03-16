package math;

import java.util.Scanner;

public class SumOfDigits {

    /*
        WAP to Print sum of digits of given number.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        while(n != 0){
            int lastDigit = n%10;
            sum += lastDigit;
            n/=10;
        }

        System.out.println("Sum of Input numbers: "+ sum);
    }

    /*
        WAP to print sum of all the even digits of a given number.
     */

    private static void calculateEvenSumOFDigit(int n){

        int sum = 0;
        while (n != 0){

            int lastDigit = n%10;
            sum += lastDigit;
            n/=10;

        }
    }
}
