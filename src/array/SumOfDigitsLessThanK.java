package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfDigitsLessThanK {

    public static void main(String[] args) {

        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        System.out.println("Enter the aray of elements:");

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int[] output = new int[array.length];
        System.out.println("Count of elements of less than k is: "+ getSumOfDigitLessThenK(array, n, k, output));
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
