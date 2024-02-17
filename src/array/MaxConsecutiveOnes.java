package array;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class MaxConsecutiveOnes {

    /*
    Problem Statement:
    Given a binary array nums, return the maximum number of consecutive 1's in the array.

    Example 1:

    Input: nums = [1,1,0,1,1,1]
    Output: 3
    Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
    Example 2:

    Input: nums = [1,0,1,1,0,1]
    Output: 2



     */
    public static void main(String[] args) {

        int[] arr = {1,0,1,1,1,0};
        System.out.println(findMaxConsecutiveOnes(arr));

        // get Concatenation array
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    public static int[] getConcatenation(int[] nums) {

        int len = nums.length;
        int[] ans = new int[2 * len];

        for (int i = 0; i < len; i++) {
            ans[i] = nums[i];
            ans[i + len] = nums[i];
        }

        System.gc();
        return ans;

    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int final_ans =0, cur_count = 0;

        for(int i=0; i <nums.length; i++){

            if(nums[i] == 1){
                cur_count++;
            }else{
                cur_count =0;
            }

            final_ans =Math.max(final_ans,cur_count );
        }

        return final_ans;
    }
}
