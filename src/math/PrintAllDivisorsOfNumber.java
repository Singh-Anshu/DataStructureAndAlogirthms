package math;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisorsOfNumber {

    /*
    Problem statement
    Given an integer ‘N’, your task is to write a program that returns all the divisors of ‘N’ in ascending order.

    For example:
    'N' = 5.
    The divisors of 5 are 1, 5.
    */
    public static void main(String[] args) {
        System.out.println(printDivisors(10));
    }

    public static List< Integer > printDivisors(int n) {
        List<Integer> list = new ArrayList<Integer>();
        // Write your code here
        for(int i=1; i<=n; i++){

            if(n % i == 0){
                list.add(i);
            }
        }

        return list;
    }
}
