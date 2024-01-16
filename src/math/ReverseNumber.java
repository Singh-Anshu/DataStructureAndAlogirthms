package math;

import java.util.Scanner;

public class ReverseNumber {

   /*
    Problem statement:
    Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
    Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.

    Sample Input 1 :
            1234
    Sample Output 1 :
            4321
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int revNum =0;

        while(n >0 ){

            int lastDigit = n % 10;
            n= n/10;
            revNum = (revNum *10) + lastDigit;
        }

        System.out.println(revNum);
    }
}
