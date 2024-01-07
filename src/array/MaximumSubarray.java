package array;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] myarray = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(myarray));
    }

    public static int maxSubArray(int[] nums) {
        int answer = Integer.MIN_VALUE;
        int max = 0;
        for(int num : nums){
            max += num;
            answer = Math.max(answer, max);
            max = Math.max(max, 0);
        }
        return answer;

    }
}
