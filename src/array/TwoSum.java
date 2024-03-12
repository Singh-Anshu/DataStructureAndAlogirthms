package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] array = {2,6,11,15};
        int target = 9;
        int length = array.length;

        System.out.println(getTwoSumIndex(array, target, length));

        System.out.println(Arrays.toString(twoSum(array, target)));

    }

    // Better Approach
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            }

            map.put(nums[i], i);

        }

        return null;
    }

    private static String getTwoSumIndex(int[] array, int target, int n){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int more = target - array[i];
            if (map.containsValue(more)) {

                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue().equals(more)) {
                        System.out.println(Math.min(i, entry.getKey()) + " " + Math.max(i, entry.getKey()));
                    }
                }

                return "YES";

            } else {
                map.put(i, array[i]);
            }
        }

        return "NO";
    }
}