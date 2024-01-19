package array;

public class RemoveDuplicatesFromSortedArray {

    /*Problem statement
    You are given a sorted integer array 'arr' of size 'n'.
    You need to remove the duplicates from the array such that each element appears only once.

    Return the length of this new array.
    Note:Do not allocate extra space for another array. You need to do this by modifying the given input array in place with O(1) extra memory.

    For example: 'n' = 5, 'arr' = [1 2 2 2 3].
    The new array will be [1 2 3].
    So our answer is 3.
    */

    public static void main(String[] args) {

        int[] arr = { 1,1, 2, 3, 4, 4, 4, 5,6,6,8,8,9 };
        int n = arr.length;

        // removeDuplicates() returns new size of array
        n = removeDuplicates(arr, n);

        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }

    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        if (n == 0 || n == 1)
            return n;

        int[] tmepArr = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            if (arr[i] != arr[i + 1])
                tmepArr[j++] = arr[i];


        tmepArr[j++] = arr[n - 1];

        // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = tmepArr[i];

        return j;
    }
}
