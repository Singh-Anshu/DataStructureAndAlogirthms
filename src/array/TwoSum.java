package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] array = {2,6,5,8,11};
        int target = 16;
        int length = array.length;

        System.out.println(getTwoSumIndex(array, target, length));

    }

    private static String getTwoSumIndex(int[] array, int target, int n){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int more = target - array[i];
            if (map.containsValue(more)) {
                return "YES";

            } else {
                map.put(i, array[i]);
            }
        }

        return "NO";
    }
}
