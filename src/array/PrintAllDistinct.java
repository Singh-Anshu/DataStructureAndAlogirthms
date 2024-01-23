package array;

public class PrintAllDistinct {

    /*
    Problem Statement:
    Given an integer array, print all distinct elements in an array. The given array may contain duplicates and the output should print every element only once.
     The given array is not sorted.

    Examples:

    Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
    Output: 12, 10, 9, 2

    Input: arr[] = {1, 2, 3, 4, 5}
    Output: 1, 2, 3, 4, 5

    Input: arr[] = {1, 1, 1, 1, 1}
    Output: 1
     */

    public static void main(String[] args) {

        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};

        for(int i=0; i < arr.length; i++) {

            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            // If not printed earlier,
            // then print it
            if (i == j)
                System.out.print( arr[i] + " ");
        }

    }
}
