package array;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOf1dArray {

    /*
    Problem Statement:
    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    Return the running sum of nums.

    Example 1:
    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

    Example 2:
    Input: nums = [1,1,1,1,1]
    Output: [1,2,3,4,5]
    Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

    Example 3:
    Input: nums = [3,1,2,10,1]
    Output: [3,4,6,16,17]

     */

    public static void main(String[] args) {

        System.out.println("Enter length of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        System.out.println("enter array:");
        for(int i=0; i < n; i++){
            input[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(runningSum(input)));

    }

    private static int[] runningSum(int[] nums) {

        int[] output = new int[nums.length];
        // Base case: if the array is empty
        if (nums.length == 0)
            return output;

        output[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            output[i] = output[i - 1] + nums[i];
        }

        return output;
    }
}
