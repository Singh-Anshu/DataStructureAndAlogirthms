package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {2,4,3,7,6,9,13,1,5,17,8,20,10,11};
        // 5,9,

        System.out.println(Arrays.toString(sortBubbleAlgorithm(arr)));

    }

    private static int[] sortBubbleAlgorithm(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

}
