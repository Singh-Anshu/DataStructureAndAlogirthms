package array;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[]= {10,30, 35, 50,70};
        int arr2[] = {20,40,50, 60, 70 };

        System.out.println(Arrays.toString(mergedTwoSortedArrays(arr1, arr2, arr1.length, arr2.length)));

    }

    private static int[] mergedTwoSortedArrays(int arr1[], int arr2[], int size1, int size2){
        int i, j, k = 0;
        int[] arr3 = new int[ size1+ size2 ];

        for(i =0 , j=0, k =0; i< size1 && j < size2; k++){

            if(arr1[i]< arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }else {

                arr3[k] = arr2[j];
                j++;
            }
        }

        while (i < size1){
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while (j < size2){
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        return arr3;
    }
}
