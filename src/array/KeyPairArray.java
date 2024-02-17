package array;

public class KeyPairArray {

    /*
    Problem Statement:
    Source: GFG -> https://www.geeksforgeeks.org/problems/key-pair5616/1
    Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.

    Example 1:
    Input:
    N = 6, X = 16
    Arr[] = {1, 4, 45, 6, 10, 8}
    Output: Yes
    Explanation: Arr[3] + Arr[4] = 6 + 10 = 16

    Example 2:
    Input:
    N = 5, X = 10
    Arr[] = {1, 2, 4, 3, 6}
    Output: Yes
    Explanation: Arr[2] + Arr[4] = 4 + 6 = 10

    Your Task:
    You don't need to read input or print anything. Your task is to complete the function hasArrayTwoCandidates() which takes the array of integers
    arr, n and x as parameters and returns a boolean denoting the answer.

    Expected Time Complexity: O(N)
    Expected Auxiliary Space: O(N)
     */

    public static void main(String[] args) {

        int[] nums = {1, 4, 45, 6, 10 ,8};
        int sum = 16;
        System.out.println(findTwoNumbers(nums, nums.length, sum));

    }

    public static Boolean findTwoNumbers(int[] arr, int n, int x) {

        boolean[] found = new boolean[100001];

        for(int i = 0; i < n; ++i) {
            int req_num = x - arr[i];
            if(req_num >= 1 && req_num <= 100000 && found[req_num])
                return true;

            found[arr[i]] = true;
        }
        return false;
    }
}
