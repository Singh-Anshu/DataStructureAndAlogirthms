package array;

public class CheckArrayIsSortedOrNot {

   /*
        Problem Statement:
        Given an array arr[] of size N, check if it is sorted in non-decreasing order or not.
    */

    public static void main(String[] args) {
        int arr[] = {10 ,20,20,30, 30 ,40 ,50, 35, 90, 10};
        int n= arr.length;
        System.out.println(arraySortedOrNot(arr, n ));
    }

    public static boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
}
