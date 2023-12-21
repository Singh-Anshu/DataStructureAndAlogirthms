package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {15,34,23,2,11};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArray(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else {
                i++;
            }
        }

    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
