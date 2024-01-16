package math;


import java.util.Arrays;

import static java.lang.Math.log10;

public class NumberOfDigits {

    /*
    Problem statement:
    You are given a number 'n'.
    Return number of digits in ‘n’.

    Example:
    Input: 'n' = 123

    Output: 3

    Explanation:
    The 3 digits in ‘123’ are 1, 2 and 3.
    */

    public static void main(String[] args) {

        int n = 2191;
        // METHOD 1
        int count = 0;
        int[] rev = new int[4];

        while(n > 0){

            rev[count] =  n % 10;
            n = n / 10;
            count++;
        }



        // METHOD 2
       // int count = (int)(log10(n) +1);

        System.out.println(count);
        System.out.println("reverse number is: "+ Arrays.toString(rev));
    }
}
