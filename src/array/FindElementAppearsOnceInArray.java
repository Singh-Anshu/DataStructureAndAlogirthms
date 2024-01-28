package array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindElementAppearsOnceInArray {

    /*
    Problem Statement:
    Given an array of integers. All numbers occur twice except one number which occurs once.
    Find the number in O(n) time & constant extra space.

    Example :
    Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
    Output: 2
     */
    public static void main(String[] args) {
        int[] input = {2, 3, 5, 4, 5, 3, 4,};

        int result = input[0] ;
        for(int i=1; i <input.length; i++){
            result = result ^ input[i];
        }

        System.out.println("The single element is: " + result);
    }

}
