package array;

public class SumOfArray {

    /*
        Problem Statement:
       Given an integer array Arr[] of size N. The task is to find sum of it.
    */

    public static void main(String[] args) {
        int arr[] = {10 ,20,20,30, 30 ,40 ,50, 35, 90, 10};
        int n= arr.length;
        System.out.println("Sum of Array is: "+ sum(arr, n ));
    }

    public static int sum(int arr[], int n) {
        int totalSum =0;

        for(int i=0; i< n; i++){

            totalSum += arr[i];
        }

        return totalSum;
        // code here
    }
}
