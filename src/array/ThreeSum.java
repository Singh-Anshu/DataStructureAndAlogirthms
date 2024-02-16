package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    /*
  Problem Statement:

  Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
  Notice that the solution set must not contain duplicate triplets.

  Example 1:

  Input: nums = [-1,0,1,2,-1,-4]
  Output: [[-1,-1,2],[-1,0,1]]
  Explanation:
  nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
  nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
  nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
  The distinct triplets are [-1,0,1] and [-1,-1,2].
  Notice that the order of the output and the order of the triplets does not matter.
  Example 2:

  Input: nums = [0,1,1]
  Output: []
  Explanation: The only possible triplet does not sum up to 0.
  Example 3:

  Input: nums = [0,0,0]
  Output: [[0,0,0]]
  Explanation: The only possible triplet sums up to 0.

   */

    public static void main(String[] args) {

        int[] nums = {0,0,0};
       List<List<Integer>> ans =  threeSum(nums);

        for (int i = 0; i < ans.size();  i++) {

            System.out.println(ans.get(i));
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();

        if (nums.length < 3) {
            return answer;
        }

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) {
                break;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int low = i + 1, high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum > 0) {
                    high--;
                } else if (sum < 0) {
                    low++;
                } else {
                    answer.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    int lastLowOccurrence = nums[low];
                    int lastHighOccurrence = nums[high];

                    while (low < high && nums[low] == lastLowOccurrence) {
                        low++;
                    }

                    while (low < high && nums[high] == lastHighOccurrence) {
                        high--;
                    }
                }
            }
        }
        return answer;
    }
}
