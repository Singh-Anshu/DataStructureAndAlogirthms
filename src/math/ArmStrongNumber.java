package math;

import java.util.Scanner;

public class ArmStrongNumber {

/*
    Problem statement
    You are given an integer 'n'.
    Return 'true' if 'n' is an Armstrong number, and 'false' otherwise.
     Note:An Armstrong number is a number (with 'k' digits) such that the sum of its digits raised to 'kth' power is equal to the number itself. For example, 371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371.

    Example:
    Input: 'n' = 1634
    Output: true

    Explanation:1634 is an Armstrong number, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        int n = sc.nextInt();
        int sum = 0;
        int x = n;
        int tocheck = n;
        while(n > 0){
            n = n / 10;
            flag++;
        }
        while(x > 0){
            int lastdig = x % 10;
            sum = sum + (int)Math.pow(lastdig, flag);
            x = x / 10;
        }
        if(sum == tocheck){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}
