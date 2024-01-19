package math;

import java.util.Scanner;

public class CheckPrime {
    /*
   Given an integer, check if it is prime or not. Print true if number is prime, print false otherwise.

    Sample Input 1 :
    7
    Sample Output 1 :
     true
    Sample Input 2 :
    15
    Sample Output 2 :
     false
   */

    public static void main(String[] args) {
        System.out.println("Enter any number to check is prime or not");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
