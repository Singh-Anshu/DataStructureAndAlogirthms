package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {

    /*

    Quick Sort Algorithm

    The three steps of QuickSort Algorithm ar as follows:

    Divide: Rearrange the elements and split the array into two subarrays and an element (know as pivot) in between such that
    each element in the left subarray is less than or equal to pivot element and each element int the right subarray is greater than
    the pivot element.

    Conquer: Recursively sort the two subarrays.

    Combine: The solutions of sub-problems to create a solution to the original problem

     */
    public static void main(String[] args) {

        int[] arr = {15, 9, 7, 13, 12, 16, 4, 18, 11};
        int length = arr.length;

        QuickSort quickSort = new QuickSort();
        quickSort.quickSortRecursion(arr, 0, length-1);
        System.out.println("Sorted Array is: "+ Arrays.toString(arr));

    }

    private int partition(int[] arr, int low, int high){

        int pivot = arr[(low + high / 2)];

        while(low <= high){

            //checking low index value is lower from pivot value
            while (arr[low] < pivot){
                low++;
            }

            //checking high index value is higher from pivot value
            while (arr[high] > pivot){
                high--;
            }

            // swapping value
            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }

        return low;

    }

    private void quickSortRecursion(int[] arr, int low, int high){


            int pi = partition(arr, low, high);

            // this will call left side pivot list
            if (low < pi - 1) {
                quickSortRecursion(arr, low, pi - 1);
            }

            // this will call right side of pivot list
            if (pi < high) {
                quickSortRecursion(arr, pi, high);
            }

    }
}
