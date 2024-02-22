package recursion;

import java.util.Scanner;

public class Pow {

    /*
    *
    * Problem Statement:
    * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
    *Example 1:

    Input: x = 2.00000, n = 10
    Output: 1024.00000
    Example 2:

    Input: x = 2.10000, n = 3
    Output: 9.26100
    Example 3:

    Input: x = 2.00000, n = -2
    Output: 0.25000
    Explanation: 2-2 = 1/22 = 1/4 = 0.25
    *
    *
     */
    public static void main(String[] args) {

        System.out.println("Enter x value in double:");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println("Enter n value in integer:");
        int n = sc.nextInt();
        System.out.println(myPow(x, n));

        sc.close();
    }

    public static double myPowHelper(double x, int n) {
        if (n == 0)
            return 1.0;
        double partial_ans = myPowHelper(x, n / 2);
        if (n % 2 == 0) {
            return partial_ans * partial_ans;
        } else {
            return partial_ans * partial_ans * x;
        }
    }

    public static double myPow(double x, int n) {
        if (n < 0) {
            return 1 / myPowHelper(x, Math.abs(n));
        } else {
            return  myPowHelper(x, n);
        }
    }
}
