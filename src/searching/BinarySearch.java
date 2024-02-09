package searching;

public class BinarySearch {

    /*

    Binary Search is the process of searching an element from sorted array by repeatedly dividing the search interval in half.
    Binary search is faster than linear search.
    Although Binary Search is a very optimised way of searching a particular element but the Array must be sorted on which
    you want to perform the search process. if the Array is not sorted in advance then we have to perform sorting first and
    then only we can perform binary search on that.

     */
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 13, 14, 16, 20};
        int searchItem = 10;


        getBinarySearch(arr, searchItem);
    }

    private static void getBinarySearch(int[] arr, int searchItem) {

        int li = 0;
        int hi = arr.length - 1;
        int mi = (li + hi) / 2;

        while (li <= hi) {

            if (arr[mi] == searchItem) {
                System.out.println("Item found mi at " + mi + " position");
                break;

            } else if (searchItem < arr[mi]) {
                hi = mi - 1;

            } else {
                li = mi + 1;

            }

            mi = (li + hi) / 2;

        }
    }
}
