package array;

import java.util.HashMap;

public class SpiltTheArray {

    /*
    *
    * Problem Statement Leetcode question no. 3046 Split the Array
    *
    * You are given an integer array nums of even length. You have to split the array into two parts nums1 and nums2 such that:
    nums1.length == nums2.length == nums.length / 2.
    nums1 should contain distinct elements.
    nums2 should also contain distinct elements.
    Return true if it is possible to split the array, and false otherwise
    * Example 1:

    Input: nums = [1,1,2,2,3,4]
    Output: true
    Explanation: One of the possible ways to split nums is nums1 = [1,2,3] and nums2 = [1,2,4].
    Example 2:

    Input: nums = [1,1,1,1]
    Output: false
    Explanation: The only possible way to split nums is nums1 = [1,1] and nums2 = [1,1]. Both nums1 and nums2 do not contain distinct elements.
    Therefore, we return false.
    *
    *
     */

    public static void main(String[] args) {

        int[] nums ={1,1,1,1,1};
        System.out.println(isPossibleToSplit(nums));

    }
    private static boolean isPossibleToSplit(int[] nums) {

        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i])>2)
                return false;
        }
        return true;

    }
}
