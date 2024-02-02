package array;

import java.util.Arrays;

public class DeleteAmElement {

    /*
    Deleting an element from Array
     */

    public static void main(String[] args) {

        int deleteElement = 10;
        int[] arr ={10,20,30,40,50,60,70,80,90,100};

        int[] output = deleteElementFromArray(arr, deleteElement);

        for(int k=0; k<output.length-1; k++){
            System.out.print(output[k]+" ");
        }
    }

    private static int[] deleteElementFromArray(int[] arr, int target){

        for(int i=0; i < arr.length; i++){

            if(target == arr[i]){

                for(int j=i; j <arr.length-1; j++){

                    arr[j] = arr[j+1];
                }
                break;
            }
        }

        return arr;
    }
}
