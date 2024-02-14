package array;

import java.util.Arrays;

public class SortArrayOfZerosAndOne {

    public static void main(String[] args) {

        int[] array = {0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1};

        int li = 0;
        int ri = array.length - 1;

        while (li <= ri) {

            if (array[li] == 1 && array[ri] == 0) {
                int temp = array[li];
                array[li] = array[ri];
                array[ri] = temp;
                li++;
                ri--;
            }

            if (array[li] == 0) {
                li++;
            }

            if (array[ri] == 1) {
                ri--;
            }

        }


        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
