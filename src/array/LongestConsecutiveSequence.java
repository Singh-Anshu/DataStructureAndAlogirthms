package array;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    /*
    * Longest Consecutive Subsequence
    * Given an array of integers, find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers,
    *  the consecutive numbers can be in any order.

    Examples:
    Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
    Output: 4
    Explanation: The subsequence 1, 3, 4, 2 is the longest subsequence of consecutive elements

    Input: arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}
    Output: 5
    Explanation: The subsequence 36, 35, 33, 34, 32 is the longest subsequence of consecutive elements.

     */
    public static void main(String[] args) {

        int[] arr = {1, 9, 1,1,1,3,3,2,2, 3, 10, 4, 20, 2};

        // first sorting the array with internal method
        Arrays.sort(arr);
        System.out.println(getLongestConsecutiveSubsequence(arr));

    }

    private static int getLongestConsecutiveSubsequence(int[] arr){

        //  {1, 2, 3, 4, 9, 10, 20 };
        // i = 4
        // max = 4
        int longest =1;
        int lastSmaller = Integer.MIN_VALUE;
        int count =0;
        for(int i=0; i < arr.length; i++){

            if( arr[i] -1  == lastSmaller ){
                count += 1;
                lastSmaller = arr[i];
            }else if( lastSmaller != arr[i]){
                count = 1;
                lastSmaller = arr[i];
            }

        }

        longest = Math.max(longest, count);

        return longest;
    }
}