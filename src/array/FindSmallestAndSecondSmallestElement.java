package array;

import java.util.ArrayList;
import java.util.Arrays;

public class FindSmallestAndSecondSmallestElement {

    /*Problem Stetement:
    Find the smallest and second smallest element in an array
    Given an array of integers, your task is to find the smallest and second smallest element in the array.
    If smallest and second smallest do not exist, print -1.
    */

    public static void main(String[] args) {
        int[] a = {2,6,9,15,7,9,5};
        int n= a.length;
        System.out.println(Arrays.toString(minAnd2ndMin(a, n)));
    }

    public static int[] minAnd2ndMin(int a[], int n)
    {
        int[] result = new int[2];

        int min = Integer.MAX_VALUE;

        int secondMin = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
           min = Math.min(min, a[i]);
        }

        for(int i = 0; i < n; i++) {

            if(a[i] > min)
                secondMin = Math.min(secondMin, a[i]);

        }
        if(min == Integer.MAX_VALUE || secondMin == Integer.MAX_VALUE) {

            return new int[]{-1};

        }else{
            return new int[]{min, secondMin};

        }

    }
}
