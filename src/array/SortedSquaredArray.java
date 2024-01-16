package array;

public class SortedSquaredArray{

   /*
    Problem Statement:
    Sorted Squared Array

    Write a function that takes in a non-empty array of integers that are sorted in ascending order
    and returns a new array of the same length with the squares of the original integers also sorted
    in ascending order.
    Sample Input:
    array = [1, 2, 3, 5, 6, 8, 9]
    Sample Output""
    [1, 4, 9, 25, 36, 64, 81]
    */

        public static void main(String[] args) {
            // you code goes here

            int[] n = {1,2,3,5,6,8,9};
            int[] outPutArray = new int[n.length];

            for(int i=0 ; i< n.length; i++){

                outPutArray[i] = n[i] *n[i];
            }

            for(int j=0 ; j < outPutArray.length; j++){

                System.out.print(outPutArray[j]+" " );
            }

        }

}
