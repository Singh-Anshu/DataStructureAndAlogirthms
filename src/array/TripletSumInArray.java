package array;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class TripletSumInArray {


  /*
  Problem statement:
    Given an array arr[] of size n and an integer X. Find if there’s a triplet in the array which sums up to the given integer X.

    Examples:

    Input: array = {12, 3, 4, 1, 6, 9}, sum = 24;
    Output: 12, 3, 9
    Explanation: There is a triplet (12, 3 and 9) present
    in the array whose sum is 24.

    Input: array = {1, 2, 3, 4, 5}, sum = 9
    Output: 5, 3, 1
    Explanation: There is a triplet (5, 3 and 1) present
    in the array whose sum is 9.
   */
    public static void main(String[] args) {

        //

        int[] nums = {12, 3, 1, 6, 9, 5};
        int sum = 15;
        find3Numbers(nums, sum);

    }

    public static Boolean find3Numbers(int[] nums, int sum) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length-2;  i++) {

            for (int j = 1; j < nums.length-2;  j++) {

                for (int k = 2; k < nums.length; k++){

                    if(nums[i]+ nums[j]+ nums[k] == sum){

                        System.out.println("Triplet is -> " + nums[i] + ", " + nums[j] + ", " + nums[k]);
                        return true;
                    }

                }
            }

        }

        System.out.println("Triplet is not found !");

        return false;
    }


}
