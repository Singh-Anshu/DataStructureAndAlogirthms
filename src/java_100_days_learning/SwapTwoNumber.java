package java_100_days_learning;

import java.util.Scanner;

public class SwapTwoNumber {

    /*
    Problem statement:
    Swap To number without using third variables and any Mathematical
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a;");
        int a = sc.nextInt();

        System.out.println("Enter valve b:");
        int b = sc.nextInt();

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("Value of a is->\t"+a+"  Value of b is->\t"+b);
    }

    /*
    *
    * Let see how we solve this question with using X-OR Method
    * Assume value of a is 5 and b is 10
    *
    * Step 1:  a = a^b
    *
    * a = 5    0 1 0 1
    * b = 10   1 0 1 0
    * ________________
    * a = 15   1 1 1 1
    *
    * Step 2:   b = a^b
    *
    * a = 15   1 1 1 1
    * b = 10   1 0 1 0
    * ________________
    * b = 5    0 1 0 1
    *
    * Step 3:  a = a^b
    *
    * a = 15   1 1 1 1
    * b = 5    0 1 0 1
    * ________________
    * a = 10   1 0 1 0
    */

}