package array;

import java.util.Arrays;

public class InsertElementInSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 8, 9, 10};
        int element = 4;
        insertElementInSortedArray(arr, element);
    }

    private static void insertElementInSortedArray(int[] arr, int element) {

        int li = 0;
        int hi = arr.length - 1;
        int mi = li + (hi - li) / 2;

        while (li <= hi) {

            if (arr[mi] == element || arr[mi] == element-1) {


                arr = new int[arr.length + 1];
                for (int i = arr.length-1; i > mi; i--) {

                    arr[i] = arr[i-1];
                }
                arr[mi + 1] = element;
                System.out.println(Arrays.toString(arr));
                break;

            } else if( element < arr[mi]){
                hi = mi - 1;

            } else {
                li = mi + 1;

            }
            mi = li + (hi - li) / 2;

        }

    }
}
