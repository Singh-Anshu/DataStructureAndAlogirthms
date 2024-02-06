package array;

import java.util.Scanner;

public class SumOfDigitsLessThanK {

    /*
    Problem Statement:
    Given an array A of size N, Print the number of elements in A with sum of digits less than K.

    Input Format

    1st line contains 2 space-separated integers: N (the size of the array) and K.
    2nd line contains N space-separated integers denoting the elements of the array.

    Constraints

    1 ≤ N ≤ 105
    1 ≤ Ai ≤ 109
    1 ≤ K ≤ 81

    Output Format

    Output should be a single integer, denoting the number of elements in A with sum of digits less than K.

    Sample Input 0

    3 9
    142 178 356
    Sample Output 0

    1
    Explanation 0

    Sum of digits of 142 = 1 + 4 + 2 = 7
    Sum of digits of 178 = 1 + 7 + 8 = 16
    Sum of digits of 356 = 3 + 5 + 6 = 14

    Out of these 3 numbers, only one number - 142 has sum of digits less than 9.
     */

    private static int ans;

    public static void main(String[] args) {

        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        System.out.println("Enter the array of elements:");

        /*int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int[] output = new int[array.length];
        System.out.println("Count of elements of less than k is: "+ getSumOfDigitLessThenK(array, n, k, output));*/

        // Optimized way
        for(int i=0 ; i<n ; i++) {
            int currNum = sc.nextInt();
            int currSum = 0;

            //Inner loop to calculate sum of digits
            while(currNum>0) {
                currSum += currNum%10;
                currNum /= 10;
            }

            // Check if sum of current number is less than k
            if(currSum < k) ans++;
        }

        System.out.println(ans);
    }

    private static int getSumOfDigitLessThenK(int[] arr, int n, int k, int[] output) {

        int count =0;
        for (int i=0; i < n; i++) {
            String temp = String.valueOf(arr[i]);
            int sum =0 ;
            for(int j=0; j < temp.toCharArray().length ; j++){
                sum += Character.getNumericValue(temp.charAt(j));

            }
            output[i] = sum;

        }

        for (int j : output) {

            if (j <= k) {
                count++;
            }
        }

        return count;
    }


}
