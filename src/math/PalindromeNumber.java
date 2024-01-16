package math;

import java.util.Scanner;

public class PalindromeNumber {

   /* Problem statement
    Check whether a given number ’n’ is a palindrome number.

    Note :
    Palindrome numbers are the numbers that don't change when reversed.
    You don’t need to print anything. Just implement the given function.
            Example:
    Input: 'n' = 51415
    Output: true
    Explanation: On reversing, 51415 gives 51415.

    Sample Input 1 :
    1032
    Sample Output 1 :
    false
    Explanation Of Sample Input 1:
    1032, on being reversed, gives 2301, which is a totally different number.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int revNum =0;

        while(n >0 ){

            int lastDigit = n % 10;
            n= n/10;
            revNum = (revNum *10) + lastDigit;
        }

        if(revNum == temp){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is Not a palindrome");
        }
        System.out.println(revNum);
    }
}
