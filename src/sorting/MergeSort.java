package sorting;

import java.util.Arrays;

public class MergeSort {

    /*
     * Merge sort is one of the most popular sorting algorithms and widely used technique.
     * Its Time Complexity is (i.e T(n) = 2T(n/2) +n) is better as compared to bubble sort, selection sort and insertion sort
     *
     * Algorithm Divide and Conquer
     * Here's how merge sort uses divide-and-conquer:
     * 1. Divide the unsorted list into n sublist, each containing 1 element.
     * 2. Take adjacent pairs of two singleton lists and merge them to form a list of 2 elements. n will now convert into n/2 lists of size 2.
     * 3. Repeat the process till a single sorted list of obtained.


     */

    int[] array;
    int[] tempMergeArr;
    int length;

    public static void main(String[] args) {

        int[] input = {48, 36, 13, 52, 19, 21};
        MergeSort ms = new MergeSort();
        ms.sort(input);
        System.out.println("Sorted Array is: "+ Arrays.toString(input));

    }

    private void sort(int inputarr[]) {

        this.array = inputarr;
        this.length = inputarr.length;
        this.tempMergeArr = new int[inputarr.length];
        divideArray(0, length - 1);

    }

    private void divideArray(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middleIndex = lowerIndex + (higherIndex - lowerIndex) / 2;
            // it will sort the left sid of an array
            divideArray(lowerIndex, middleIndex);

            // it will sort the right side of array
            divideArray(middleIndex + 1, higherIndex);

            mergeArray(lowerIndex, middleIndex, higherIndex);
        }
    }

    public void mergeArray(int lowerIndex, int middleIndex, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex;  i++) {

            tempMergeArr[i] = array[i];

        }

        int i = lowerIndex;
        int j = middleIndex + 1;
        int k = lowerIndex;

        while (i <= middleIndex && j <= higherIndex){

            if(tempMergeArr[i] <= tempMergeArr[j]){
                array[k] = tempMergeArr[i];
                i++;
            }else{

                array[k] = tempMergeArr[j];
                j++;
            }

            k++;
        }

        while (i <= middleIndex){
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }
}
