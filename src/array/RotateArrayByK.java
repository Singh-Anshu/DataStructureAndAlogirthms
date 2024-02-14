package array;

public class RotateArrayByK {

    /*
    Problem Statement:
    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

    Example 1:

    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
    Example 2:

    Input: nums = [-1,-100,3,99], k = 2
    Output: [3,99,-1,-100]
    Explanation:
    rotate 1 steps to the right: [99,-1,-100,3]
    rotate 2 steps to the right: [3,99,-1,-100]

     */
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k=3;

        RotateArrayByK rotateArrayByK = new RotateArrayByK();
        rotateArrayByK.rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public void rotate(int[] nums, int k) {

        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        // System.out.println(Arrays.toString(nums));
    }

    public void reverse(int[] nums, int li, int hi) {
        while (li < hi) {

            int temp = nums[li];
            nums[li] = nums[hi];
            nums[hi] = temp;

            li++;
            hi--;
        }
    }
}
